package edu.grcy.patterns.behavioral.templateMethod;

public class PhoneNewsProvider extends NewsProvider{
    private String phone;

    public PhoneNewsProvider(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean authorize() {
        System.out.println("Authorized phone number " + phone);
        return true;
    }

    @Override
    public boolean endConnection() {
        System.out.println("Connection terminated with " + phone);
        return super.endConnection();
    }
}
