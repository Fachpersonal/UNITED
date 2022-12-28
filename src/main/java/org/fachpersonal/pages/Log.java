package org.fachpersonal.pages;

import org.fachpersonal.Program;
import org.fachpersonal.util.Logger;

public class Log extends Page{

    public Log(Page parent) {
        super("Log Page", parent);
    }

    @Override
    public void displayPage() {
        Program.outputStream.println("------------------------------------------------");
        for (int i = 0; i < Logger.logs.size(); i++) {
            Program.outputStream.println(Logger.logs.get(i));
        }
        Program.outputStream.println("------------------------------------------------");
        returnToPreviousPage();
    }

    @Override
    protected void changePage() {
    }
}
