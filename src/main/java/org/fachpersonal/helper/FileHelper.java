package org.fachpersonal.helper;

import java.io.*;

/**
 * FileHelper for United Assistant
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public class FileHelper {
    /**
     * Reads file and return its content as a whole String
     * @param path
     * @return content of file as whole String
     */
    public static String readFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            StringBuilder result = new StringBuilder();
            while ((line = br.readLine()) != null) {
                result.append(line).append("\n");
            }
            br.close();
            return result.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * reads file and saves its content as Strings (line per line) in an Array
     * @param path
     * @return content of files saved in an Array
     */
    public static String[] readLines(String path) {
        String content = readFile(path);
        if (content.contains("\n")) {
            return content.split("\n");
        }
        return new String[]{content};
    }

    /**
     * Writes content to file
     * @param content
     * @param path
     * @return false if it couldn't write to file
     */
    public static boolean write(String[] content, String path) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            for (String s : content) {
                bw.write(s);
                bw.newLine();
            }
            bw.close();
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Writes content to file
     * @param content
     * @param path
     * @return false if it couldn't write to file
     */
    public static boolean write(String content, String path) {
        if (content.contains("\n")) {
            return write(content.split("\n"), path);
        } else {
            return write(new String[]{content}, path);
        }
    }
}