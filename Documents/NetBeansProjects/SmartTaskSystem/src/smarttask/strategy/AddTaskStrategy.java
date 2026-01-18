package smarttask.strategy;

import smarttask.observer.TaskManager;

public interface AddTaskStrategy {
    void add(String text, TaskManager manager);
}

