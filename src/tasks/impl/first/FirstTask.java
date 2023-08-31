package tasks.impl.first;

import tasks.Task;

/**
 * В реляционной БД есть таблица сотрудников с полями: id
 * (уникальный идентификатор, NUMBER), surname (фамилия
 * сотрудника, VARCHAR), experience (опыт работы, NUMBER).
 * Необходимо составить SQL-запрос, который вернет фамилию
 * сотрудника со вторым максимальным опытом работы.
 */
public class FirstTask implements Task {
    private final String SQL_QUERY = "SELECT * FROM \"Employee\" ORDER BY experience DESC OFFSET 1 LIMIT 1";

    @Override
    public void run() {
        System.out.println(this.SQL_QUERY);
    }
}
