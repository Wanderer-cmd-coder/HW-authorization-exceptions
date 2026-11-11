package ru.netology.hwauthorizationexceptions.domain;

import java.util.List;

public class UserData {

    private final String password;
    private final List<Authorities> auth;

    public UserData(String password, List<Authorities> auth) {
        this.password = password;
        this.auth = auth;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuth() {
        return auth;
    }


}
