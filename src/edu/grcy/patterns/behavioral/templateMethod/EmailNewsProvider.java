package edu.grcy.patterns.behavioral.templateMethod;

public class EmailNewsProvider extends NewsProvider {
    String email;

    public EmailNewsProvider(String email) {
        this.email = email;
    }

    @Override
    public boolean authorize() {
        System.out.println("Email authorized : " + email);
        return false;
    }

}
