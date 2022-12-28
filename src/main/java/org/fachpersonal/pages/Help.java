package org.fachpersonal.pages;

import org.fachpersonal.Program;

public class Help extends Page {

    public Help(Page parent) {
        super("Help Page", parent);
    }

    @Override
    public void displayPage() {
        Program.outputStream.println("Nothing here... D:");
        changePage();
    }

    @Override
    protected void changePage() {
        returnToPreviousPage();
    }
}
