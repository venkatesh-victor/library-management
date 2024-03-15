package com.zsgs.librarymanagement.librarysetup;

import java.util.Scanner;

import com.zsgs.librarymanagement.*;
import com.zsgs.librarymanagement.book.BookView;

public class LibrarySetupView {

    private LibrarySetupModel librarySetupModel;

    public LibrarySetupView() {
        librarySetupModel = new LibrarySetupModel(this);
    }

    public void init() {
        librarySetupModel.startSetup();
    }

    public void onSetupComplete() {
        System.out.println("\nLibrary setup already completed.");
        new BookView().init();
    }

    public void showAlert(String alert) {
        System.out.println("\nPrint any errors here.");
    }

    public void initiateSetup() {
        System.out.println("\n\nGet Library Details from here.");
    }
    
}
