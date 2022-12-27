package org.fachpersonal;

import org.fachpersonal.logger.Logger;
import org.fachpersonal.util.R;

public class Program {
    public static void main(String[] args) {
        R.in = System.in;
        R.out = System.out;
        R.log = new Logger();
    }
}
