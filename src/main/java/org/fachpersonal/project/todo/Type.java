package org.fachpersonal.project.todo;
/**
 * Type enum which saves specific Types
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public enum Type {
    TASK(0),
    BUG(1);

    private int id;

    /**
     * Constructor of Type
     * @param id
     */
    Type(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }
}
