package edu.grcy.solid.dip.fix;

public class TaskService {
    Repository repository;

    /**
     * Dependency Injection polega na wstrzyknięciu zależności (inaczej pól klasy)
     * np. przez konstruktor
     *
     * przy DI nie używamy w klasie "new" do inicjowania obiektów "składowych"
     * tylko chcemy je w jakiś sposób dostać z zewnątrz
     */
    public TaskService(Repository repository) {
        this.repository = repository;
    }

    public void addTask(String task) {
        repository.saveTask(task);
    }

    public void removeTask(String task) {
        repository.deleteTask(task);
    }

    /**
     * Setter to też jest sposób na Dependency Injection
     *
     */
    public void setRepository(Repository repository) {
        this.repository = repository;
    }
}
