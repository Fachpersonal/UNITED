package org.fachpersonal.util;

import org.fachpersonal.Program;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Logger {

    public static ArrayList<String> logs = new ArrayList<>();

    public static boolean debug = true;

    public static void info(String message) {
        displayLog("[INFO] " + message);
        logs.add("[INFO] " + message);
    }

    public static void debug(String message) {
        if(debug) {
            displayLog("[DEBUG] " + message);
            logs.add("[DEBUG] " + message);
        }
    }

    public static void verbose(String message) {
        displayLog("[VERBOSE] " + message);
        logs.add("[VERBOSE] " + message);
    }

    public static void error(String message) {
        if(debug) {
            displayLog("[ERROR] " + message);
            logs.add("[ERROR] " + message);
        }
    }

    private static void displayLog(String message) {
        Program.outputStream.println("@" + getTimeStamp() + message);
    }

    private static String getTimeStamp() {
        return new SimpleDateFormat("HH:mm:ss").format(new Timestamp(System.currentTimeMillis()));
    }

}
