package edu.grcy.patterns.behavioral.chainOfResponsibility;

public class EmployeeSeniorityCheck extends AccessCheck {
    @Override
    public boolean doCheck(String username) {
        System.out.println("EmployeeSeniorityCheck start for " + username);
        if(Employees.checkEmployeeLevel(username) < 12) {
            System.out.println(getClass().getCanonicalName() + " do_Check FAILED");
            return false;
        }
        System.out.println(getClass().getCanonicalName() + " do_Check PASSED");
        return checkNextElement(username);
    }
}
