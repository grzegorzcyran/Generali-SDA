package edu.grcy.solid.ocp.fixed;

public class DatabaseLogger implements MessageLogger {

    @Override
    public void log(String message) throws Exception {
        System.out.println("Writing to database:" + message);
    }
}
