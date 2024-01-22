# Task Management System

The Task Management System is a simple Java application for managing tasks using a MySQL database. It allows users to create, retrieve, update, and delete tasks through a console-based interface.

## Project Structure

- **src/main/java/Task.java**: Defines the `Task` class representing a task with properties like `id`, `title`, `description`, and `dueDate`.
- **src/main/java/TaskManager.java**: Implements the `TaskManager` class for managing tasks, including methods for creating, retrieving, updating, and deleting tasks.
- **database/create_table.sql**: SQL script to create the necessary `tasks` table in a MySQL database.

## Setup and Usage

1. **Database Setup**:
   - Set up a MySQL database named `task_manager`.
   - Execute the SQL script `create_table.sql` to create the required `tasks` table.

2. **Configure Database Connection**:
   - Update the JDBC connection details in `TaskManager.java` to match your MySQL server, username, and password.

3. **Run the Application**:
   - Compile and run the `TaskManager` class to interact with the Task Management System.

4. **Example Usage**:
   - Use the application to create tasks, view all tasks, and perform other operations.

## Enhancements and Customization

Feel free to customize and enhance the project:
- Add a graphical user interface using JavaFX or Swing.
- Implement user authentication and authorization.
- Add date validation and error handling for robustness.
- Integrate logging for better debugging and monitoring.

## Dependencies

- **JavaSE**: Core Java features for application logic.
- **JDBC (Java Database Connectivity)**: API for connecting to and interacting with databases.
- **MySQL**: Relational database for storing task information.

## Contributing

Contributions are welcome! If you find issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
