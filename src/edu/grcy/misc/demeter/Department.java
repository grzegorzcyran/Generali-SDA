package edu.grcy.misc.demeter;

public class Department {
    private String name;
    private Manager manager;
    // Other fields...

    public Department(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }
}

class Manager extends Employee {
    public Manager(Department department) {
        super(department);
    }
}
