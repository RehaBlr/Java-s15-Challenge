package com.challenge.library.model;

public class User extends Person{
    private boolean isMember;
    public User(long TC, String name, String lastName, String address) {
        super(TC, name, lastName, address);

    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    @Override
    public String toString() {
        return "User{" +
                "isMember=" + isMember +
                '}';
    }
}
