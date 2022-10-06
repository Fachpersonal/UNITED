package org.fachpersonal.helper;

public enum Paths {
    LOGS ("C:/Users/falscherIdiot/Documents/Assistant/logs"),
    ACCOUNTS ("C:/USERS/falscherIdiot/Documents/Assistant/accounts"),
    TODOS ("C:/USERS/falscherIdiot/Documents/Assistant/todos");

    private String path;
    Paths(String path) {
        this.path = path;
    }

    public String getPath() {return path;}
}
