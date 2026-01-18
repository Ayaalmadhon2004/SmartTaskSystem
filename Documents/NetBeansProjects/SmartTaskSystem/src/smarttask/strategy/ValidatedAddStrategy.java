package smarttask.strategy;

import smarttask.core.BasicTask;
import smarttask.observer.TaskManager;

public class ValidatedAddStrategy implements AddTaskStrategy {
    @Override
    public void add(String text, TaskManager manager) {
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Task cannot be empty!");
            return;
        }
        manager.addTask(new BasicTask(text));
    }
}
