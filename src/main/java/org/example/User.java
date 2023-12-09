package org.example;

public class User {
    //system Login
    //system Logout
    //system Talk
    //system Synthesis

    protected String username;
    protected boolean isAdmin;

    User(String user){
        this.username = user;
        this.isAdmin = false;
    }

    public String getUsername(){return this.username;}
    public boolean userIsAdmin(){return this.isAdmin;}

    public void setAdmin(){
        this.isAdmin = true;
    }
}