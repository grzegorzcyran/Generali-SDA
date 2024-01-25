package edu.grcy.solid.dip;

public class DipTest {
    public static void main(String[] args) {
        TaskService service = new TaskService();
        service.addTask("SampleFile.txt");
        service.removeTask("OtherFile.txt");
    }
}
