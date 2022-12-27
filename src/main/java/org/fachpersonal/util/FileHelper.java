package org.fachpersonal.util;

import java.io.*;
import java.util.ArrayList;

public class FileHelper {
    public static String[] readFile(File file) throws IOException {
        ArrayList<String> _result = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            _result.add(line);
        }
        br.close();
        return (String[]) _result.toArray();
    }

    public static String[] readFile(String fileName) throws IOException {
        return readFile(new File(fileName));
    }

    public static void writeFile(String fileName, String text) throws IOException {
        writeFile(new File(fileName), text, false);
    }

    public static void writeFile(String fileName, String[] text) throws IOException {
        writeFile(new File(fileName), text, false);
    }

    public static void writeFile(String fileName, String text, boolean append) throws IOException {
        writeFile(new File(fileName), text, append);
    }

    public static void writeFile(String fileName, String[] text, boolean append) throws IOException {
        writeFile(new File(fileName), text, append);
    }

    public static void writeFile(File file, String text) throws IOException {
        writeFile(file, text, false);
    }

    public static void writeFile(File file, String[] text) throws IOException {
        writeFile(file, text, false);
    }

    public static void writeFile(File file, String text, boolean append) throws IOException {
        writeFile(file, new String[]{text}, append);
    }

    public static void writeFile(File file, String[] text, boolean append) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, append));
        for (String line : text) {
            bw.write(line);
            bw.newLine();
        }
        bw.close();
    }
}
