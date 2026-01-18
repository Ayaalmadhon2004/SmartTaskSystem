package smarttasksystem;

import smarttask.observer.TaskManager;
import smarttask.observer.ConsoleObserver;
import smarttask.core.BasicTask;
import smarttask.core.Task;
import smarttask.decorator.PriorityTask;
import smarttask.decorator.TimedTask;
import smarttask.strategy.AddTaskStrategy;
import smarttask.strategy.SimpleAddStrategy;
import smarttask.strategy.ValidatedAddStrategy;
import smarttask.adapter.ExternalNews;
import smarttask.adapter.NewsAdapter;
import smarttask.adapter.NewsItem;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        manager.addObserver(new ConsoleObserver());

        // Strategy
        AddTaskStrategy strategy = new SimpleAddStrategy();
        strategy.add("Learn Java", manager);

        strategy = new ValidatedAddStrategy();
        strategy.add("", manager);
        strategy.add("Build Design Patterns Project", manager);

        // Decorator
        Task decorated = new PriorityTask(new TimedTask(new BasicTask("Submit Assignment")));
        manager.addTask(decorated);

        // Adapter
        List<ExternalNews> external = new ArrayList<>();
        ExternalNews n = new ExternalNews();
        n.headline = "Adapter Pattern Works!";
        external.add(n);

        List<NewsItem> adapted = NewsAdapter.adapt(external);
        System.out.println("News After Adapter:");
        for (NewsItem item : adapted) {
            System.out.println(item.title);
        }
    }
}

