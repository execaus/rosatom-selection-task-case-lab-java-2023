package tasks.impl.second;

import tasks.Task;

/**
 * Есть 2 целочисленных переменных a и b, в которых хранятся определенные
 * значения. Нужно написать на Java метод, меняющий местами значения
 * переменных a и b, не используя 3й переменной.
 */
public class SecondTask implements Task {
    @Override
    public void run() {
        final var container = new PairNumberContainer();
        System.out.println(container.getString());
        container.replaceValues();
        System.out.println(container.getString());
    }
}
