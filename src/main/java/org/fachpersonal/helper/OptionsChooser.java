package org.fachpersonal.helper;

import java.util.Scanner;

/**
 * OptionsChooser class which allows to select or choose between certain options
 *
 * @author Fachpersonal
 * @version 0.1
 * @since 07.10.2022
 */
public class OptionsChooser<E> {

    private final E[] options;

    /**
     * Constructor of OptionsChooser
     * @param options
     */
    public OptionsChooser(E[] options) {
        this.options = options;
    }

    /**
     * Displays all possible options and allows to choose between one of them
     * @param in
     * @return chosen Object
     */
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
