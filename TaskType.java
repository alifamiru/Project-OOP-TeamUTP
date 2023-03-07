import java.util.ArrayList;
import java.util.Scanner;
public class TaskType {
    public final ArrayList<String> type;

    public TaskType(ArrayList<String> type) {
        this.type = type;
    }

    public int getIndex(String type) {
        return this.type.indexOf(type);
    }

    public String getType(int index) {
        return this.type.get(index);
    }

    public void removeType(int index) {
        this.type.remove(index);
    }

    public void addType(String type) {
        this.type.add(type);
    }

    public static void main(String[] args) {
        ArrayList<String> types = new ArrayList<>();
        TaskType taskType = new TaskType(types);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add task type");
            System.out.println("2. Remove task type");
            System.out.println("3. View task types");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter task type: ");
                    String type = scanner.next();
                    taskType.addType(type);
                    System.out.println(type + " added.");
                    break;
                case 2:
                    System.out.print("Enter task type index: ");
                    int index = scanner.nextInt();
                    taskType.removeType(index);
                    System.out.println("Task type removed.");
                    break;
                case 3:
                    System.out.println("Task types:");
                    for (int i = 0; i < taskType.type.size(); i++) {
                        System.out.println(i + ": " + taskType.type.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
    
    
    
    
    