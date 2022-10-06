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
}