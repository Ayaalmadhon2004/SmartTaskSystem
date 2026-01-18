package smarttask.observer;

import smarttask.core.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private List<TaskObserver> observers = new ArrayList<>();

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void addTask(Task task) {
        tasks.add(task);
        notifyObservers();
    }

    private void notifyObservers() {
        for (TaskObserver o : observers) {
            o.update(tasks);
        }
    }
}
