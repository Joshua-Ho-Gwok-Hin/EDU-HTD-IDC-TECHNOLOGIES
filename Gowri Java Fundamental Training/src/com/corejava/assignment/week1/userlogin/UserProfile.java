package com.corejava.assignment.week1.userlogin;

import static com.corejava.assignment.week1.userlogin.LoginService.loginService;

public class UserProfile {

    private long id;
    private Login login;
    private String fullName;
    private static long count;

    public UserProfile(String username) {
        this(username, null);
    }

    public UserProfile(String username, String fullName) {
        this.fullName = fullName;
        count++;
        id = count;
        login = new Login(username, id);
        loginService.addLoginService(login); //

    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", Username=" + login.getUsername() +
                ", fullName='" + fullName + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
