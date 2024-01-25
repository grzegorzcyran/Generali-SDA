package edu.grcy.patterns.behavioral.chainOfResponsibility;


public class XCompany {
    private Employees employees;
    private AccessCheck accessCheck;

    public void setCheck(AccessCheck accessCheck) {
        this.accessCheck = accessCheck;
    }

    public boolean enterRoom(String user) {
        if(accessCheck.doCheck(user)) {
            System.out.println("Access granted for " + user);
            return true;
        }
        System.out.println("Access forbidden for " + user);
        return false;
    }

}
