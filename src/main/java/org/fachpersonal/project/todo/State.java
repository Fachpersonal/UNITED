package org.fachpersonal.project.todo;

public enum State {
    OPEN(0),
    IN_WORK(1),
    RESOLVED(2),
    DONE(3);

    private int id;

    State(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
