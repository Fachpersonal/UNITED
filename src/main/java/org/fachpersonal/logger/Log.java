package org.fachpersonal.logger;

import java.sql.Timestamp;
import java.util.Objects;

public record Log(String logger, String message, Type type, Timestamp timestamp) {

    public Log{
        Objects.requireNonNull(logger);
        Objects.requireNonNull(message);
        Objects.requireNonNull(timestamp);

    }

    public Log(String logger, String message, Type type) {
        this(logger, message, type, new Timestamp(System.currentTimeMillis()));
    }

    public String toString() {
        return timestamp+"@"+logger+" [" + type.toString() + "] " + message;
    }
}
