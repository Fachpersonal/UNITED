package org.fachpersonal;

import org.fachpersonal.account.Account;
import org.fachpersonal.helper.OptionsChooser;
import org.fachpersonal.project.Project;

import java.util.Scanner;

/**
 * Main class which allows to run UNITED Assistant
 * @author Fachpersonal
 * @version 0.1
 * @since 06.10.2022
 */
public class Main {
    private final Account admin;
    private final Project proj;
    private final Scanner in;

    /**
     * Constructor of Main
     */
    public Main() {
        this.admin = new Account("admin", "admin", true);
        this.proj = new Project("UNITED", "UNI", this.admin, null, "Assistant halt");
        this.in = new Scanner(System.in);

        String cmd;
        while (true) {
            System.out.print(" >> ");
            cmd = in.nextLine();
            switch (cmd) {
                case "ts":
                    showTODO();
                    continue;
                case "tc":
                    createTODO();
                    continue;
                case "tr":
                    removeTODO();
                    continue;
                case "0x0":
                    break;
                default:
                    help();
                    continue;
            }
            System.out.println("Good bye!");
            System.exit(1);
        }
    }

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        new Main();
    }

    /**
     * Help menu
     */
    private static void help() {
        System.out.println("---+=:: TODO ::=+---");
        System.out.println("\thelp\t-\tthis menu");
        System.out.println("\ttc\t-\tcreate TODO");
        System.out.println("\ttr\t-\tremove TODO");
        System.out.println("\tts\t-\tshow all TODOS");
        System.out.println("---+=:: TODO ::=+---");
    }

    /**
     * Allows to create a To-Do Object
     */
    private void createTODO() {
        OptionsChooser<Type> typeOptionsChooser = new OptionsChooser<>(Type.class.getEnumConstants());
        OptionsChooser<Priority> priorityOptionsChooser = new OptionsChooser<>(Priority.class.getEnumConstants());
        Type type = (Type) typeOptionsChooser.chooseOption(in);
        Priority priority = (Priority) priorityOptionsChooser.chooseOption(in);
        String title = null;
        String description = null;
        do {
            in.nextLine(); // ?? For some reason it skips this
            System.out.print("Title >> ");
            title = in.nextLine();
            System.out.print("Description >> ");
            description = in.nextLine();
        } while (title == null || description == null);
        proj.getTodos().add(new TODO(type, admin, null, priority, proj, title, description));
        System.out.println("TODO successfully created!");
        for (int i = 0; i < proj.getTodos().size(); i++) {
            System.out.println(proj.getTodos().get(i).toString());
        }
    }

    /**
     * Allows to remove a To-Do
     */
    private void removeTODO() {
        OptionsChooser<TODO> todoChooser = new OptionsChooser<TODO>((TODO[])(proj.getTodos().toArray()));
        proj.getTodos().remove(todoChooser.chooseOption(in));
    }

    /**
     * Displays all saved To-Dos
     */
    private void showTODO() {
        for(TODO t : proj.getTodos()) {
            System.out.println(t.toString());
        }
    }
}