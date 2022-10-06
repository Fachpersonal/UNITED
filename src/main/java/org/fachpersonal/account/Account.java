package org.fachpersonal.account;

import java.time.LocalDateTime;

public class Account {
    private final String firstName;
    private final String surName;
    private final LocalDateTime joined;

    public Account(String firstName, String surName) {
        this.firstName = firstName;
        this.surName = surName;
        this.joined = LocalDateTime.now();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDateTime getJoined() {
        return joined;
    }
}
