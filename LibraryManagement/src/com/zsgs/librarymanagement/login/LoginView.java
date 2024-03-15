package com.zsgs.librarymanagement.login;

import java.util.Scanner;

import com.zsgs.librarymanagement.librarysetup.LibrarySetupView;

public class LoginView {

    private LoginModel loginModel;

    public LoginView() {
        loginModel = new LoginModel(this);
    }

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String userName = sc.next();

        System.out.print("Enter the password: ");
        String password = sc.next();

        sc.close();

        loginModel.validateUser(userName, password);
    }

    public void onSuccess() {
        System.out.println("Login Success");

        LibrarySetupView librarySetupView = new LibrarySetupView();
        librarySetupView.init();
    }

    public void showAlert(String alert) {
        System.out.println(alert);
    }
}
