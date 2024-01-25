package edu.grcy.patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class CompanyEmployees {
    static List<String> employees;

    public CompanyEmployees() {
        this.employees = new ArrayList<>();
    }

    public static boolean isActiveEmployee(String username) {
        return employees.contains(username);
    }

    public List<String> getUsers() {
        return employees;
    }

    public void setUsers(List<String> users) {
        this.employees = users;
    }


}
