package smarttask.core;

public abstract class TaskDecorator implements Task {
    protected Task task;

    public TaskDecorator(Task task) {
        this.task = task;
    }
}

