package org.fachpersonal.issue;

import java.util.Objects;

public record Issue(String title, String description, Type type, Priority priority) {
    public Issue {
        Objects.requireNonNull(title);
        Objects.requireNonNull(description);
        Objects.requireNonNull(type);
        Objects.requireNonNull(priority);
    }
}
