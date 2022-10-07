package org.fachpersonal;

import org.fachpersonal.account.Account;
import org.fachpersonal.helper.OptionsChooser;
import org.fachpersonal.project.Project;
import org.fachpersonal.project.todo.Priority;
import org.fachpersonal.project.todo.TODO;
import org.fachpersonal.project.todo.Type;

import java.util.Scanner;

public class Main {
    private final Account admin;
    private final Project proj;
    private final Scanner in;

    public Main() {
        this.admin = new Account("admin", "Admin", true);
        this.proj = new Project("Assistant", "ASSI", this.admin, null, "Assistant halt");
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

    public static void main(String[] args) {
        new Main();
    }

    private static void help() {
        System.out.println("---+=:: TODO ::=+---");
        System.out.println("\thelp\t-\tthis menu");
        System.out.println("\ttc\t-\tcreate TODO");
        System.out.println("\ttr\t-\tremove TODO");
        System.out.println("\tts\t-\tshow all TODOS");
        System.out.println("---+=:: TODO ::=+---");
    }

    private void createTODO() {
        OptionsChooser<Type> typeOptionsChooser = new OptionsChooser<>(Type.class.getEnumConstants());
        OptionsChooser<Priority> priorityOptionsChooser = new OptionsChooser<>(Priority.class.getEnumConstants());
        Type type = (Type) typeOptionsChooser.chooseOption(in);
        Priority priority = (Priority) priorityOptionsChooser.chooseOption(in);
        System.out.print("Title >> ");
        String title = in.nextLine();
        System.out.print("Description >> ");
        String description = in.nextLine();
        proj.getTodos().add(new TODO(type, admin, null, priority, proj, title, description));
    }

    private void removeTODO() {
    }

    private void showTODO() {
    }
}