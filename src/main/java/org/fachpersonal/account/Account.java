package org.fachpersonal.account;

import org.fachpersonal.helper.FileHelper;

import java.time.LocalDateTime;

public class Account {
    private final String firstName;
    private final String surName;
    private final LocalDateTime joined;

    public Account(String firstName, String surName, boolean newAccount) {
        this.firstName = firstName;
        this.surName = surName;
        this.joined = (newAccount ? LocalDateTime.now() : null);
    }

    public static Account loadAccount() {
        FileHelper.readLines("");
        return null;
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
