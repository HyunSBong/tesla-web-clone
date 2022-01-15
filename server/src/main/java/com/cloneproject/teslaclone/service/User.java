package com.cloneproject.teslaclone.service;

public class User {

    int id;
    String userId;
    String password;
    String email;

    public User(int id, String userId, String password, String email) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.email = email;
    }
}
