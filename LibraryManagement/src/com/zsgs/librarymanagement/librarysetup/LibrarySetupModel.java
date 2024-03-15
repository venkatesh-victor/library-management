package com.zsgs.librarymanagement.librarysetup;

import com.zsgs.librarymanagement.model.Library;

public class LibrarySetupModel {
    private LibrarySetupView librarySetupView;
    private Library library = new Library();

    LibrarySetupModel(LibrarySetupView librarySetupView) {
        this.librarySetupView = librarySetupView;
        library.setLibraryName("ZSGS Library");
        library.setLibraryId(1);
    }

    public void startSetup() {
        if(library == null || library.getLibraryId() == 0) {
            librarySetupView.initiateSetup();
        } else {
            librarySetupView.onSetupComplete();
        }
    }
}
