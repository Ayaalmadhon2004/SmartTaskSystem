package smarttask.strategy;

import smarttask.core.BasicTask;
import smarttask.observer.TaskManager;

public class SimpleAddStrategy implements AddTaskStrategy {
    @Override
    public void add(String text, TaskManager manager) {
        manager.addTask(new BasicTask(text));
    }
}
