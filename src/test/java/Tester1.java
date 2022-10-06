import org.fachpersonal.helper.Paths;

import java.io.File;

public class Tester1 {
    public static boolean logDirectoryExists() {
        File f = new File(Paths.LOGS.getPath());
        return f.exists() && f.isDirectory();
    }
    public static boolean accountDirectoryExists() {
        File f = new File(Paths.ACCOUNTS.getPath());
        return f.exists() && f.isDirectory();
    }
    public static boolean todoDirectoryExists() {
        File f = new File(Paths.TODOS.getPath());
        return f.exists() && f.isDirectory();
    }

    public static void main(String[] args) {
        System.out.println("Runninng Tester - 1");
        System.out.println("-------------------");
        int x = 0;
        System.out.println("Log directory ");
        if(logDirectoryExists()) {
            System.out.print("exists!");
            x++;
        } else {
            System.out.print("does not exists!");
        }
        System.out.println("Account directory ");
        if(accountDirectoryExists()) {
            System.out.print("exists!");
            x++;
        } else {
            System.out.print("does not exists!");
        }
        System.out.println("TODO directory ");
        if(accountDirectoryExists()) {
            System.out.print("exists!");
            x++;
        } else {
            System.out.print("does not exists!");
        }
        System.out.println(x + " / 3 directories exists!");
    }
}
