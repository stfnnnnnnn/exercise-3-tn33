import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * The ToDoApp class in Java represents a simple command-line to-do list application with
 * functionalities to add tasks, show tasks, remove tasks, and exit the program.
 */
public class ToDoApp {

     /** The list that stores all tasks. */
    private static final List<String> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Clears the console screen.
     * Tries to use ANSI escape codes, otherwise prints 50 blank lines.
     */
    public static void clearScreen() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }

    /**
     * Prints the title of the To-Do List application.
     */
    public static void printAppTitle() {
        System.out.println("=================================");
        System.out.println("          My To-Do List           ");
        System.out.println("=================================");
    }

     /**
     * Prints the main menu with available options for the user.
     */
    public static void printMenu() {
        System.out.println("\n----------- Main Menu -----------");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.println("---------------------------------");
        System.out.print("Enter your choice [1-4]: ");
    }

    /**
     * The `loading` function in Java displays a message followed by a loading animation with dots.
     * 
     * Args:
     *   message (String): The `loading` method takes a `String` parameter called `message`, which is
     * the message to be displayed while the loading animation is running.
     */
    public static void loading(String message) {
        System.out.print(message);
        try {
            Thread.sleep(500); System.out.print(".");
            Thread.sleep(500); System.out.print(".");
            Thread.sleep(500); System.out.println(".");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /**
     * The `addTask` function logs data, adds a task to a list, prints a message confirming the task
     * addition, displays a loading message, and clears the screen.
     * 
     * Args:
     *   task (String): The `addTask` method in the code snippet you provided takes a `String`
     * parameter named `task`. This parameter represents the task that needs to be added to a
     * collection of tasks. The method first logs some data, adds the task to the collection, prints a
     * message indicating that the task has
     */
    public static void addTask(String task) {
        loading("\nLogging data");
        tasks.add(task);
        System.out.println("\nTask added: " + task);
        loading("Loading");
        clearScreen(); 
    }


     /**
     * Displays all tasks currently in the task list. If the list is empty,
     * it notifies the user. The method waits for the user to press Enter
     * before clearing the screen.
     */
    public static void showTasks() {
        loading("\nLoading tasks");
        System.out.println("\n=========== Your Tasks ===========");
        if (tasks.isEmpty()) {
            System.out.println("No tasks yet.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + tasks.get(i));
            }
        }
        System.out.println("==================================");
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
        clearScreen(); 
    }

    /**
     * Removes a task from the task list based on the task number entered by the user.
     * It validates the input, displays appropriate messages, and waits for the user
     * to press Enter before clearing the screen.
     */
    public static void removeTask() {
        loading("\nLoading tasks");
        if (tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            System.out.print("\nPress Enter to continue...");
            scanner.nextLine();
            clearScreen();
            return;
        }

        System.out.println("\n=========== Your Tasks ===========");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("[" + (i + 1) + "] " + tasks.get(i));
        }
        System.out.println("==================================");

        System.out.print("\nEnter task number to remove: ");
        int num;
        try {
            num = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number.");
            System.out.print("\nPress Enter to continue...");
            scanner.nextLine();
            clearScreen();
            return;
        }

        if (num > 0 && num <= tasks.size()) {
            String removedTask = tasks.remove(num - 1);
            loading("Removing task");
            System.out.println("Removed task: " + removedTask);
            loading("Loading");
        } else {
            System.out.println("Invalid task number.");
        }
        System.out.print("\nPress Enter to continue...");
        scanner.nextLine();
        clearScreen(); 
    }

    /**
     * The main method is the entry point of the program. It continuously
     * displays the menu, handles user input, and calls corresponding methods
     * until the user chooses to exit.
     *
     */
    public static void main(String[] args) {
        clearScreen();
        printAppTitle();

        while (true) {
            printMenu(); // Show menu to user

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine()); // Read user input
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            loading("\nProcessing choice");
            clearScreen();
            printAppTitle();

            // Handle user's choice
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Task: ");
                    String task = scanner.nextLine();
                    addTask(task);
                }
                case 2 -> showTasks();
                case 3 -> removeTask();
                case 4 -> { 
                    System.out.println("Exiting... Goodbye!");
                    loading("Closing");
                    clearScreen();
                    return;
                }
                default -> { // Displays error for invalid menu choice
                    System.out.println("Wrong Choice!! Please try again.");
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                    clearScreen();
                }
            }
        }
    }
}
