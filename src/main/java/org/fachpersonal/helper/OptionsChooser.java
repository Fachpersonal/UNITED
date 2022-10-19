package org.fachpersonal.helper;

import java.util.Scanner;

public class OptionsChooser<E> {

    private final E[] options;

    public OptionsChooser(E[] options) {
        this.options = options;
    }

    public Object chooseOption(Scanner in) {
        System.out.println("--------------------------------------");
        for (int i = 0; i < options.length; i++) {
            System.out.println("[" + (i + 1) + "] " + options[i].toString());
        }
        System.out.println("--------------------------------------");
        System.out.print("Pick a number (1-" + options.length + ") : ");
        return options[in.nextInt() - 1];
    }
}
