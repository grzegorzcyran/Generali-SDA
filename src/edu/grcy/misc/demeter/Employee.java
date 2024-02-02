package edu.grcy.misc.demeter;

public class Employee {
    private Department department;

    public Employee(Department department) {
        this.department = department;
    }

    //poniższa metoda łamie prawo Demeter bo klasa Employee nie ma dostępu do Manager'a bezpośrednio
    public void approveExpense(Expenses expenses) {
        department.getManager().approveExpense(expenses);
    }


    public void approve(Expenses expenses) {
        department.approveExpences(expenses);
    }
}