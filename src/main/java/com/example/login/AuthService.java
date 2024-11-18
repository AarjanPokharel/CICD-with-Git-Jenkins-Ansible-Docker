package com.example.login;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    private Map<String, String> users = new HashMap<>();

    public AuthService() {
        // Predefined users for demonstration purposes
        users.put("admin", "password123");
        users.put("user", "userpass");
    }

    public boolean authenticate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
