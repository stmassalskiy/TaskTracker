package org;

import java.util.Set;

public class User {


    private int id;
    private String fname;
    private String lname;
    private String depart;
    private Set<Groups> groups;
    private String email;

    public User(int id, String fname, String lname, String depart, Set<Groups> groups, String email) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.depart = depart;
        this.groups = groups;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public Set<Groups> getGroups() {
        return groups;
    }

    public void setGroups(Set<Groups> groups) {
        this.groups = groups;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
