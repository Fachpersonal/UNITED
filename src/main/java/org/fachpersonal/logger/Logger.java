package org.fachpersonal.logger;

import org.fachpersonal.util.FileHelper;
import org.fachpersonal.util.R;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class Logger {
    public void log(Log log) {
        write2Log(log.logger(), log.message(), log.type(), log.timestamp());
    }
    
    public void info(String logger, String message) {
        write2Log(logger, message, Type.INFO, new Timestamp(System.currentTimeMillis()));
    }
    public void warning(String logger, String message) {
        write2Log(logger, message, Type.WARNING, new Timestamp(System.currentTimeMillis()));
    }
    public void error(String logger, String message) {
        write2Log(logger, message, Type.ERROR, new Timestamp(System.currentTimeMillis()));
    }
    public void verbose(String logger, String message) {
        write2Log(logger, message, Type.VERBOSE, new Timestamp(System.currentTimeMillis()));
    }
    
    private void write2Log(String logger, String message, Type type, Timestamp timestamp) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
        SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss.SSS");

        try {
            FileHelper.writeFile(R.Directories.log.path + date.format(timestamp.getTime()) + ".log", String.format("%s@%s [%s] %s",time.format(timestamp.getTime()), logger, message, type), true);
            R.out.printf("%s@%s [%s] %s%n",time.format(timestamp.getTime()), logger, message, type);
        } catch (IOException e) {
            R.out.printf("%s@%s [%s] %s%n",time.format(timestamp.getTime()), getClass().getSimpleName(), "Error while writing into file!", Type.ERROR);
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            R.out.printf("%s@%s [%s] %s%n",time.format(timestamp.getTime()), getClass().getSimpleName(), sw, Type.ERROR);
        }
    }
    
}
