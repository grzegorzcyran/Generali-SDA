package edu.grcy.patterns.behavioral.templateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {

        NewsProvider firstProvider = new EmailNewsProvider("aaa@bbb.cc");
        firstProvider.setMessage("First notification");
        firstProvider.provideNews();

        System.out.println("==============");
        System.out.println("==============");
        NewsProvider secondProvider = new PhoneNewsProvider("+44 11 22 33 44");
        secondProvider.setMessage("Work in London!");
        secondProvider.provideNews();
    }
}
