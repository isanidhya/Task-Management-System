import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/task_manager";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // ... (rest of the code)

    public static void main(String[] args) {
        // Example usage
        Task task = new Task(0, "Sample Task", "This is a sample task description", new Date(System.currentTimeMillis()));
        createTask(task);

        List<Task> allTasks = getAllTasks();
        for (Task t : allTasks) {
            System.out.println(t);
        }
    }
}
