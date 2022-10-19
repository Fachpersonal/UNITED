package org.fachpersonal.project.todo;

/**
 * State enum which saves specific States
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public enum State {
    OPEN(0),
    IN_WORK(1),
    RESOLVED(2),
    DONE(3);

    private int id;

    /**
     * Constructor of State
     * @param id
     */
    State(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
