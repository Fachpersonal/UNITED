package org.fachpersonal.project.todo;

public enum Type {
    TASK(0),
    BUG(1);

    private int id;

    Type(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
