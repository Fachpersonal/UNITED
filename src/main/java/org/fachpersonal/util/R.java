package org.fachpersonal.util;

import org.fachpersonal.logger.Logger;

import javax.swing.filechooser.FileSystemView;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class R {
    public static InputStream in;
    public static PrintStream out;
    public static Logger log;

    public static enum Directories {
        log(FileSystemView.getFileSystemView().getDefaultDirectory().getPath() + "/UNITED/logs/");

        public String path;

        Directories(String path) {
            this.path = path;
        }
    }
}
