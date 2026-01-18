package smarttask.observer;

import smarttask.core.Task;
import java.util.List;

public class ConsoleObserver implements TaskObserver {
    @Override
    public void update(List<Task> tasks) {
        System.out.println("Tasks Updated:");
        for (Task t : tasks) {
            System.out.println("- " + t.getDescription());
        }
    }
}

