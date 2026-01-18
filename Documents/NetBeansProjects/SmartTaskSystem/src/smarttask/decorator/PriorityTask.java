package smarttask.decorator;

import smarttask.core.Task;
import smarttask.core.TaskDecorator;

public class PriorityTask extends TaskDecorator {
    public PriorityTask(Task task) {
        super(task);
    }

    @Override
    public String getDescription() {
        return "[PRIORITY] " + task.getDescription();
    }
}
