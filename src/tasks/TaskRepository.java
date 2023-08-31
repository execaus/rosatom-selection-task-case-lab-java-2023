package tasks;

import tasks.impl.first.FirstTask;
import tasks.impl.second.SecondTask;

public class TaskRepository {
    private final Task[] tasks;

    public TaskRepository() {
        this.tasks = new Task[] {
            new FirstTask(),
            new SecondTask(),
        };
    }
    
    public void runTasks() {
        for (Task task: this.tasks) { task.run(); };
    }
}
