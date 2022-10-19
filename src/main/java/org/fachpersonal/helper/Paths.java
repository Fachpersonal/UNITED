package org.fachpersonal.helper;

/**
 * Path enum have saved important path
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public enum Paths {
    LOGS("C:/Users/falscherIdiot/Documents/Assistant/logs"),
    ACCOUNTS("C:/Users/falscherIdiot/Documents/Assistant/accounts"),
    TODOS("C:/Users/falscherIdiot/Documents/Assistant/todos");

    private final String path;

    /**
     * Constructor of Path
     * @param path
     */
    Paths(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
