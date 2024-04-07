package com.corejava.assignment.week1.userlogin;

import java.util.ArrayList;

public class LoginService implements Authenticate {

    ArrayList<Login> loginArrayList;
    static LoginService loginService = new LoginService();
    UserProfile user;


    public LoginService() {
        loginArrayList = new ArrayList<Login>();
    }

    @Override
    public boolean isLoginSuccessful(String username, String password) {

        for (int i = 0; i < loginArrayList.size(); i++) {

            if (loginArrayList.get(i).getUsername().compareTo(username)==0) {
//                System.out.println(loginArrayList.get(i).getUsername() + " " + username);

                if (loginArrayList.get(i).getPassword().compareTo(password) == 0) {
//                    System.out.println(loginArrayList.get(i).getPassword() + " " + password);
                    System.out.println("Login successful");
                    return true;
                } else {
                    System.out.println("Wrong Password");
                }
            }
        }
        System.out.println("Login failed, please check your credentials.");
        return false;
    }

    private boolean searchLogin(String username) {
        for (Login search : loginArrayList) {
            if (search.getUsername().compareTo(username) == 0) {
                return true;
            }
        }
        return false;
    }

    public void addLoginService(Login login) {
        loginArrayList.add(login);
    }

    public ArrayList<Login> getLoginArrayList() {
        return loginArrayList;
    }
}
