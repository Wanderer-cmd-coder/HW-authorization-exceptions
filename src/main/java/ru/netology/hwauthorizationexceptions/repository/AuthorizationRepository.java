package ru.netology.hwauthorizationexceptions.repository;

import org.springframework.stereotype.Repository;
import ru.netology.hwauthorizationexceptions.domain.Authorities;
import ru.netology.hwauthorizationexceptions.domain.UserData;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ru.netology.hwauthorizationexceptions.domain.Authorities.*;

@Repository
public class AuthorizationRepository {
    private final Map<String, UserData> users = new HashMap<String, UserData>();

    public AuthorizationRepository() {
        users.put("login1", new UserData("pass1", List.of(READ, WRITE, DELETE)));
        users.put("login2", new UserData("pass2", List.of(READ, WRITE)));
        users.put("login3", new UserData("pass3", List.of(READ)));
    }

    public List<Authorities> getUserAuthorities(String login, String password) {
        UserData userData = users.get(login);
        if (userData != null  && userData.getPassword().equals(password)) {
            return userData.getAuth();
        }
        return List.of();
    }

}