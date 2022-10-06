package org.fachpersonal.project.todo;

public enum Priority {
    NONE(0),
    MINOR(1),
    MAJOR(2);

    private int id;

    Priority(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
