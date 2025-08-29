package org;

import javax.swing.*;

public class Administration {
    private int id;
    private Project project;
    private User user;
    private Groups groups;
    private Role roles;

    public Administration(int id, Project project, User user, Groups groups, Role roles) {
        this.id = id;
        this.project = project;
        this.user = user;
        this.groups = groups;
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }
}
