package smarttask.core;

public class BasicTask implements Task {
    private String description;

    public BasicTask(String description) {
        this.description = description;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

