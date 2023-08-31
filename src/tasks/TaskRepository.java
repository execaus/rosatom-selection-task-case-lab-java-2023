package tasks;

import tasks.impl.FirstTask;

public class TaskRepository {
    private final Task[] tasks;

    public TaskRepository() {
        this.tasks = new Task[] {
            new FirstTask(),
        };
    }
    
    public void runTasks() {
        for (Task task: this.tasks) { task.run(); };
    }
}
