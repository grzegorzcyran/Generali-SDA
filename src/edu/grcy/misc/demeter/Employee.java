package edu.grcy.misc.demeter;

public class Employee {
    private Department department;

    public Employee(Department department) {
        this.department = department;
    }

    public void approveExpense(Expenses expenses) {
        department.getManager().approveExpense(expenses);
    }
}