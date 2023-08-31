package tasks.impl.third;

import tasks.Task;
import tasks.impl.third.linked_list.impl.IntegerLinkedList;

/**
 * Написать Java-программу, которая инвертирует односвязный список.
 */
public class ThirdTask implements Task {
    @Override
    public void run() {
        var list = new IntegerLinkedList()
            .append(2)
            .append(4)
            .append(6);

        System.out.println(list);
        list.reverse();
        System.out.println(list);
    }
}
