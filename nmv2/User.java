package com.s24740.wypozyczalnia;

public class User {
    private String accId;

    public User(String accId) {
        this.accId = accId;
    }

    @Override
    public String toString() {
        return "User{" +
                "accId='" + accId + '\'' +
                '}';
    }
}
