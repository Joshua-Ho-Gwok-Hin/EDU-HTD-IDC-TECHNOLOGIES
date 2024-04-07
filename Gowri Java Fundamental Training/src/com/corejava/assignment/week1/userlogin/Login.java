package com.corejava.assignment.week1.userlogin;

public class Login {

    private String username;
    private String password;
    private long loginId;

    public Login(String username, long id) {
        this.username = username;
        password = "password";
        this.loginId = id;
    }

    public long getLoginId() {
        return loginId;
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
}
