package edu.grcy.solid.ocp.fixed;

public class FileLoggerUsage {
    public static void main(String[] args) {
        MessageLogger messageLogger = new FileLogger();
        Logger anotherApp = new Logger(messageLogger);

        try {
            anotherApp.log("Sth different");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
