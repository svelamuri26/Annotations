package org.startsteps.week7.LibraryManagement;

public class User {
    private final String johnDoe;
    private final int i;
    private final String mail;
    String name;
    int age;
    public User(String johnDoe, int i, String mail) {
        this.johnDoe = johnDoe;
        this.i = i;
        this.mail = mail;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getemailID() {
        return name;
    }
}
