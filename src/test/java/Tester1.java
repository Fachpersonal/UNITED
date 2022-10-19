import org.fachpersonal.helper.Paths;

import java.io.File;
/**
 * Tester class which allows to run specified tests
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public class Tester1 {
    /**
     * Checks if the log directory exists
     * @return true if log directory exists
     */
    public static boolean logDirectoryExists() {
        File f = new File(Paths.LOGS.getPath());
        return f.exists() && f.isDirectory();
    }

    /**
     * Checks if the account directory exists
     * @return true if account directory exists
     */
    public static boolean accountDirectoryExists() {
        File f = new File(Paths.ACCOUNTS.getPath());
        return f.exists() && f.isDirectory();
    }

    /**
     * Checks if the to-do directory exists
     * @return true if to-do directory exists
     */
    public static boolean todoDirectoryExists() {
        File f = new File(Paths.TODOS.getPath());
        return f.exists() && f.isDirectory();
    }

    /**
     * Tester runner
     * @param args
     */
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
