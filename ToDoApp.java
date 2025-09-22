// ToDoApp.java
import java.util.*; 

public class ToDoApp {
    static ArrayList tasks = new ArrayList();

    public static void addtask(String t){
        tasks.add(t);
        System.out.println("Task Added!!"); 
    }

    public static void showTasks( ) {
        if(tasks.size()==0){
            System.out.println("No tasks yet"); 
        }
        else {
            for(int i=0;i<=tasks.size();i++){ 
                System.out.println((i+1)+". "+tasks.get(i));
            }
        }
    }

    public static void removeTask(int n) {
        tasks.remove(n); 
        System.out.println("task removed"); 
    }

    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("1 Add Task"); // <-- inconsistent spacing
            System.out.println("2.Show Tasks");
            System.out.println("3.Remove Task");
            System.out.println("4 Exit");
            int choice=s.nextInt(); // 
            if(choice==1){
                System.out.println("Enter Task: "); 
                String t=s.nextLine(); 
                addtask(t);
            } else if(choice==2){
                showTasks();
            } else if(choice==3){
                System.out.print("Enter task no to remove: ");
                int n=s.nextInt(); 
                removeTask(n); // <--
            } else if(choice==4){
                break; 
            } else{
                System.out.println("Wrong Choice!!");
            }
        }
    }
}
