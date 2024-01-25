package edu.grcy.patterns.behavioral.chainOfResponsibility;

public class ChainTest {
    public static void main(String[] args) {
        Employees employees = new Employees();
        employees.addEmployee("Jan Kowalski", 8);
        employees.addEmployee("Maria Zduń", 12);
        employees.addEmployee("Michał Panik", 6);

        //1 sprawdzenie w łańcuchu
        AccessCheck accessCheck = new CompanyInsiderCheck();
        //kolejne sprawdzenie w łańcuchu
        accessCheck.addChainElement(new EmployeeSeniorityCheck());
        //do dorobienia sprawdzenie właściwego działu

        XCompany myCompany = new XCompany();
        myCompany.setCheck(accessCheck);

        System.out.println("====================");
        myCompany.enterRoom("Jan Kowalski");
        System.out.println("====================");
        myCompany.enterRoom("Grzegorz Dec");
        System.out.println("====================");
        myCompany.enterRoom("Maria Zduń");
        System.out.println("====================");
    }
}
