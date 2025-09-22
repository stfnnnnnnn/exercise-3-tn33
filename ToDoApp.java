import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoApp {

    private static final List<String> tasks = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

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

    public static void printAppTitle() {
        System.out.println("=================================");
        System.out.println("          My To-Do List           ");
        System.out.println("=================================");
    }

    public static void printMenu() {
        System.out.println("\n----------- Main Menu -----------");
        System.out.println("1. Add Task");
        System.out.println("2. Show Tasks");
        System.out.println("3. Remove Task");
        System.out.println("4. Exit");
        System.out.println("---------------------------------");
        System.out.print("Enter your choice: ");
    }

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

    public static void addTask(String task) {
        loading("\nLogging data");
        tasks.add(task);
        System.out.println("\nTask added: " + task);
        loading("Loading");
        clearScreen(); 
    }

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

    public static void main(String[] args) {
        clearScreen();
        printAppTitle();

        while (true) {
            printMenu();

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            loading("\nProcessing choice");
            clearScreen();
            printAppTitle();

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
                default -> {
                    System.out.println("Wrong Choice!! Please try again.");
                    System.out.print("\nPress Enter to continue...");
                    scanner.nextLine();
                    clearScreen();
                }
            }
        }
    }
}
