
package com.pojo;

public class User {
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private String retypepassword;
    private String picture;

    public User() {
    }

    public User(String firstname) {
        this.firstname = firstname;
    }

    public User(String firstname, String lastname, String username, String password, String retypepassword, String picture) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.retypepassword = retypepassword;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRetypepassword() {
        return retypepassword;
    }

    public void setRetypepassword(String retypepassword) {
        this.retypepassword = retypepassword;
    }
    
}
