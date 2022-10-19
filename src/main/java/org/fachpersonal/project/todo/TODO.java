package org.fachpersonal.project.todo;

import org.fachpersonal.account.Account;
import org.fachpersonal.project.Project;
/**
 * To-Do class which allows to save and manage To-Dos
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public class TODO {

    private final Type type;
    private final Account createdBy;
    private final Priority priority;
    private final String issueTag;
    private final Project project;
    private Account assignee;
    private State state;
    private String title;
    private String description;

    /**
     * Constructor of To-Do
     * @param type
     * @param createdBy
     * @param assignee
     * @param priority
     * @param project
     * @param title
     * @param description
     */
    public TODO(Type type, Account createdBy, Account assignee, Priority priority, Project project, String title, String description) {
        this.type = type;
        this.createdBy = createdBy;
        this.assignee = assignee;
        this.priority = priority;
        this.state = State.OPEN;
        this.project = project;
        this.title = title;
        this.description = description;
        this.issueTag = project.getIssue_Name() + "-" + (project.getTodos().size() + 1);
    }

    public String getIssueTag() {
        return issueTag;
    }

    public Project getProject() {
        return project;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public Priority getPriority() {
        return priority;
    }

    public Account getAssignee() {
        return assignee;
    }

    public void setAssignee(Account assignee) {
        this.assignee = assignee;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return All infos about To-Do
     */
    public String toString() {return type.toString() +" | "+ createdBy.getFirstName() +" "+ createdBy.getSurName() +" | "+ priority +" | "+ issueTag +" | "+ project.getProj_Name() +" | "+ assignee +" | "+ state +" | "+ title +" | "+ description;}
}