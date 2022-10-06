package org.fachpersonal.helper;

import java.io.*;

public class FileHelper {
    public static String readFile(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            StringBuilder result = new StringBuilder();
            while((line = br.readLine()) != null)
            {
                result.append(line).append("\n");
            }
            br.close();
            return result.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String[] readLines(String path) {
        String content = readFile(path);
        if(content.contains("\n")) {
            return content.split("\n");
        }
        return null;
    }

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

    public static boolean write(String content, String path) {
        if(content.contains("\n")) {
            return write(content.split("\n"),path);
        } else {
            return write(new String[] {content},path);
        }
    }
}