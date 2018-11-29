package com.kodilla.library;

import com.sun.istack.internal.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity(name = "USER")
public class User {

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "SIGN_UP_DATE")
    private LocalDateTime signUpDate;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.signUpDate = LocalDateTime.now();
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDateTime getSignUpDate() {
        return signUpDate;
    }
}
