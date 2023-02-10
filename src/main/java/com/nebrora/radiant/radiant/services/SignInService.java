package com.nebrora.radiant.radiant.services;

public class SignInService {
    public boolean signIn(String username, String password) {
        return username.equals("emil")&& password.equals("emil");
    }
}