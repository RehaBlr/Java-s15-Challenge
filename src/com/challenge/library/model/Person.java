package com.challenge.library.model;

public class Person {
    private long TC;
    private String name;
    private String lastName;
    private String address;

    public Person(long TC, String name, String lastName, String address) {
        this.TC = TC;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
    }

    public long getTC() {
        return TC;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "TC='" + TC + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
