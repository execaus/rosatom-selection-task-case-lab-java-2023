package tasks.impl;

import tasks.Task;

public class FirstTask implements Task {
    private final String SQL_QUERY = "SELECT * FROM \"Employee\" ORDER BY experience DESC OFFSET 1 LIMIT 1";

    @Override
    public void run() {
        System.out.println(this.SQL_QUERY);
    }
}
