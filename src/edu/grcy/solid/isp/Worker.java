package edu.grcy.solid.isp;

public interface Worker {
    void work();
    void eat();
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        // Implementation for robot worker
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}

class HumanWorker implements Worker {
    @Override
    public void work() {

    }

    @Override
    public void eat() {

    }
}