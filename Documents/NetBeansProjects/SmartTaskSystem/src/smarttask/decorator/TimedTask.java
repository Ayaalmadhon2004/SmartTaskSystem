package smarttask.decorator;

import smarttask.core.Task;
import smarttask.core.TaskDecorator;

public class TimedTask extends TaskDecorator {
    public TimedTask(Task task) {
        super(task);
    }

    @Override
    public String getDescription() {
        return task.getDescription() + " (Has Deadline)";
    }
}
