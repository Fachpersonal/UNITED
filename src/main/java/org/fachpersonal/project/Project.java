package org.fachpersonal.project;

import org.fachpersonal.account.Account;
import org.fachpersonal.project.todo.TODO;

import java.util.ArrayList;

public class Project {
    private final Account createdBy;
    private String proj_Name;
    private String issue_Name;
    private String description;
    private Account[] contributors;

    private ArrayList<TODO> todos;

    public Project(String proj_Name, String issue_Name, Account createdby, Account[] contributors, String description) {
        this.proj_Name = proj_Name;
        this.issue_Name = issue_Name;
        this.createdBy = createdby;
        this.contributors = contributors;
        todos = new ArrayList<TODO>();
    }

    public ArrayList<TODO> getTodos() {
        return todos;
    }

    public String getProj_Name() {
        return proj_Name;
    }

    public void setProj_Name(String proj_Name) {
        this.proj_Name = proj_Name;
    }

    public String getIssue_Name() {
        return issue_Name;
    }

    public void setIssue_Name(String issue_Name) {
        this.issue_Name = issue_Name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public Account[] getContributors() {
        return contributors;
    }

    public void setContributors(Account[] contributors) {
        this.contributors = contributors;
    }
}
