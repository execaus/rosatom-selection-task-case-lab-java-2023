package tasks;

public class TaskRepository {
    private final Task[] tasks;

    public TaskRepository() {
        this.tasks = new Task[] {};
    }
    
    public void runTasks() {
        for (Task task: this.tasks) { task.run(); };
    }
}
