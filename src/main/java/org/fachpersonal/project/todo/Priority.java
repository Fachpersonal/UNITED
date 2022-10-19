package org.fachpersonal.project.todo;

/**
 * Priority enum which saves specific Priority-States
 *  *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public enum Priority {
    NONE(0),
    MINOR(1),
    MAJOR(2);

    private final int id;

    /**
     * Constructor of Priority
     * @param id
     */
    Priority(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

}
