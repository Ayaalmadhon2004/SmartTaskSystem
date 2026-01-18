package smarttask.observer;

import smarttask.core.Task;
import java.util.List;

public interface TaskObserver {
    void update(List<Task> tasks);
}

