package com.zsgs.librarymanagement.book;

public class BookView {
    private BookModel bookModel;
    
    public BookView() {
        bookModel = new BookModel(this);
    }

    public void init() {
        bookModel.startSetup();
    }
    
    public void onSetupComplete() {
        System.out.println("\nBooks details are completed");
    }

    public void initiateSetup() {
        System.out.println("\n\nGet Library details from here.");
    }

    public void showAlert(String alert) {
        System.out.println(alert);
    }
}
