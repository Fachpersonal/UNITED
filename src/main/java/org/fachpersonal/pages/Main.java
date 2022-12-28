package org.fachpersonal.pages;

import org.fachpersonal.Program;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Main extends Page{
    public Main() {
        super("Main Page", null);
    }

    @Override
    public void displayPage() {
        Program.outputStream.println("Hello Fachpersonal,");
        Program.outputStream.println("-------------------");
        Program.outputStream.println("Today's date is " + new SimpleDateFormat("yyyy-MM-dd").format(new Timestamp(new Date().getTime())));
        Program.outputStream.println("Current time is " + new SimpleDateFormat("HH:mm").format(new Timestamp(System.currentTimeMillis())));
        Program.outputStream.println("\nHave a great Work-Day\n\n");
        Program.outputStream.println("How can I help you today?");
        Program.outputStream.print(" @> ");
        changePage();
    }

    @Override
    protected void changePage() {
        for (int i = 0; i < child.length; i++) {
            Program.outputStream.println("Open " + child[i].name + "["+(i+1)+"]");
        }
        int x = Program.inputStream.nextInt();
        changePage(child[x-1]);
    }
}
