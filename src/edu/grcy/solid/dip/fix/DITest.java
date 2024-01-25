package edu.grcy.solid.dip.fix;

public class DITest {
    public static void main(String[] args) {
        Repository repository = new FileRepository();
        TaskService taskService = new TaskService(repository);

        taskService.addTask("aaa.txt");
        taskService.removeTask("bbb.dat");

        //================================
        System.out.println("Klient zmienia decyzję, chce korzystać z bazy danych");
        repository = new DatabaseRepository();
        taskService.setRepository(repository);

        taskService.addTask("Check DB connection");

    }
}
