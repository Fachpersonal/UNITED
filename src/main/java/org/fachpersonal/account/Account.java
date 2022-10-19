package org.fachpersonal.account;

import org.fachpersonal.helper.FileHelper;

import java.time.LocalDateTime;

/**
 * Account class which allows to save/create and manage accounts
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public class Account {
    private final String firstName;
    private final String surName;
    private final LocalDateTime joined;

    /**
     * Constructor of Account
     * @param firstName
     * @param surName
     * @param newAccount
     */
    public Account(String firstName, String surName, boolean newAccount) {
        this.firstName = firstName;
        this.surName = surName;
        this.joined = (newAccount ? LocalDateTime.now() : null);
    }

    /**
     * Loads account from files
     * @return Account objects read from file
     */
    public static Account[] loadAccount() {
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
