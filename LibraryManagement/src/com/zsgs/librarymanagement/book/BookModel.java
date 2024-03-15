package com.zsgs.librarymanagement.book;

public class BookModel {
    private BookView bookView;

    BookModel(BookView bookView) {
        this.bookView = bookView;
    }

    public void startSetup() {
        bookView.onSetupComplete();
    }
}
