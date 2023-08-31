package tasks;

import tasks.impl.first.FirstTask;
import tasks.impl.second.SecondTask;
import tasks.impl.third.ThirdTask;

/**
 * Хранилище всех задач.
 */
public class TaskRepository {
    private final Task[] tasks;

    public TaskRepository() {
        this.tasks = new Task[] {
            new FirstTask(),
            new SecondTask(),
            new ThirdTask(),
        };
    }

    /**
     * Запускает все имеющиеся задачи.
     */
    public void runTasks() {
        for (Task task: this.tasks) { task.run(); };
    }
}
