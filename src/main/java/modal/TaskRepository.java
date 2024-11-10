package modal;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private static List<Task> tasks = new ArrayList<>();
    private static int taskCounter = 1;

    public static void addTask(String description, String status) {
        Task task = new Task(taskCounter++, description, status);
        tasks.add(task);
    }

    public static List<Task> getAllTasks() {
        return tasks;
    }

    public static void deleteTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }
}
