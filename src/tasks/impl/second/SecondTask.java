package tasks.impl.second;

import tasks.Task;

public class SecondTask implements Task {
    @Override
    public void run() {
        final var container = new NumbersContainer();
        System.out.println(container.getString());
        container.replaceValues();
        System.out.println(container.getString());
    }
}
