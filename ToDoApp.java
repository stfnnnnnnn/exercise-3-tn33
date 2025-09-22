// ToDoApp.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 

public class ToDoApp {
    
    private static final List<String> tasks = new ArrayList<>();

    public static void addTask(String task){
        tasks.add(task);
        System.out.println("Task added!"); 
    }

    public static void showTasks( ) {
        if(tasks.isEmpty()){
            System.out.println("No tasks yet"); 
        }
        else {
            for(int i = 0; i < tasks.size(); i++) { 
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void removeTask(int n) {
        tasks.remove(n); 
        System.out.println("task removed");  
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1 Add Task");
            System.out.println("2. Show Tasks");
            System.out.println("3 Remove Task");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Task: "); 
                    String task = scanner.nextLine(); 
                    addTask(task);
                }
                case 2 -> showTasks();
                case 3 -> {
                    System.out.print("Enter task number to remove: ");
                    int num = scanner.nextInt();
                    scanner.nextLine();
                    removeTask(num);
                }
                case 4 -> {
                    System.out.println("bye. . .");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Wrong Choice!!");
            }
        }
    }
}