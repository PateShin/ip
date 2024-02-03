/**
 * The Ui class is responsible for handling user interface interactions and displaying messages to the user.
 * It provides methods for displaying welcome messages, reading user input, showing task-related messages, and handling errors.
 */
package duke;

import duke.task.Task;

import java.util.List;
import java.util.Scanner;

public class Ui {
    private Scanner scanner;

    /**
     * Constructs a Ui object and initializes the scanner for user input.
     */
    public Ui() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays a line separator to separate different sections of messages.
     */
    public void showLine() {
        System.out.println("____________________________________________________________");
    }

    /**
     * Displays a welcome message when the application starts.
     */
    public void showWelcome() {
        showLine();
        System.out.println("\n Hello! I'm FICIN!");
        System.out.println(" What can I do for you?");
    }

    /**
     * Reads a command from the user.
     *
     * @return The user's input command.
     */
    public String readCommand() {
        return scanner.nextLine().trim();
    }

    /**
     * Displays a goodbye message when the user exits the application.
     */
    public void showGoodbye() {
        showLine();
        System.out.println(" \nBye. Hope to see you again soon!");
        showLine();
    }

    /**
     * Displays an error message to the user.
     *
     * @param message The error message to be displayed.
     */
    public void showError(String message) {
        showLine();
        System.out.println(" OOPS!!! " + message);
    }

    /**
     * Displays a message indicating that a task has been added.
     *
     * @param task           The task that was added.
     * @param numberOfTasks  The total number of tasks after adding.
     */
    public void showTaskAdded(Task task, int numberOfTasks) {
        showLine();
        System.out.println(" Got it. I've added this task:");
        System.out.println("   " + task);
        System.out.println(" Now you have " + numberOfTasks + " tasks in the list.");
        showLine();
    }

    /**
     * Displays a message indicating that a task has been marked as done.
     *
     * @param task The task that was marked as done.
     */
    public void showTaskDone(Task task) {
        showLine();
        System.out.println(" Nice! I've marked this task as done:");
        System.out.println("   " + task);
        showLine();
    }

    /**
     * Displays a message indicating that a task has been marked as not done.
     *
     * @param task The task that was marked as not done.
     */
    public void showTaskUndone(Task task) {
        showLine();
        System.out.println(" OK, I've marked this task as not done yet:");
        System.out.println("   " + task);
        showLine();
    }

    /**
     * Displays a message indicating that a task has been deleted.
     *
     * @param task           The task that was deleted.
     * @param numberOfTasks  The total number of tasks after deletion.
     */
    public void showTaskDeleted(Task task, int numberOfTasks) {
        showLine();
        System.out.println(" Noted. I've removed this task:");
        System.out.println("   " + task);
        System.out.println(" Now you have " + numberOfTasks + " tasks in the list.");
        showLine();
    }

    /**
     * Displays a list of tasks to the user.
     *
     * @param tasks The list of tasks to be displayed.
     */
    public void showTasks(List<Task> tasks) {
        showLine();
        System.out.println(" Here are the tasks in your list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(" " + (i + 1) + "." + tasks.get(i));
        }
        showLine();
    }

    /**
     * Closes the scanner used for user input.
     */
    public void closeScanner() {
        scanner.close();
    }
}