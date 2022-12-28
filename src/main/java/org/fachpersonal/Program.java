package org.fachpersonal;

import org.fachpersonal.pages.Help;
import org.fachpersonal.pages.Main;
import org.fachpersonal.pages.Log;
import org.fachpersonal.util.Logger;

import java.io.PrintStream;
import java.util.Scanner;


public class Program {

    public static Scanner inputStream;
    public static PrintStream outputStream;

    public static void main(String[] args) {
        Logger.info("Initializing system...");
        initPages();
        initInputOutputStreams();
        Logger.info("Finished initializing system!");
    }

    private static void initPages() {
        Logger.debug("Initializing all pages...");
        Main mP = new Main();
        new Help(mP);
        new Log(mP);
        Logger.debug("Finished initializing pages!");
        mP.displayPage();
    }

    private static void initInputOutputStreams() {
        inputStream = new Scanner(System.in);
        outputStream = System.out;
    }
}
