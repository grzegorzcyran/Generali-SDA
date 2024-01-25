package edu.grcy.patterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ProxyDemo {
    public static void main(String[] args) {
        CompanyEmployees companyEmployees = new CompanyEmployees();
        List<String> employees = Arrays.asList("Jan Kowalski", "Maria Nowak", "Zofia Pałac", "Robert Górniak");
        companyEmployees.setUsers(employees);

        CompanyInternetNetwork internetNetwork = new ProxyCompanyInternetAccess();
        internetNetwork.getAccess("Jan Kowalski");
        internetNetwork.getAccess("Jan Nowak");
        internetNetwork.getAccess("Zofia Pałac");
        internetNetwork.getAccess("Mariusz Kałamaga");


    }
}
