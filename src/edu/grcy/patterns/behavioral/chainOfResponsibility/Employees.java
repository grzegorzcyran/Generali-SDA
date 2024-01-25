package edu.grcy.patterns.behavioral.chainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Employees {

    private static Map<String, Integer> companyEmployees;

    public Employees() {
        this.companyEmployees = new HashMap<>();
    }

    public Map<String, Integer> getCompanyEmployees() {
        return companyEmployees;
    }

    public boolean addEmployee(String newEmployee, int level) {
        companyEmployees.put(newEmployee, level);
        return true;
    }

    public static boolean checkEmployee(String employee) {
        return companyEmployees.keySet().contains(employee);
    }

    public static Integer checkEmployeeLevel(String employee) {
        return companyEmployees.get(employee);
    }

}
