import java.time.LocalDate;
import java.util.Scanner;

public class Task extends TaskType{
    private String description;
    private LocalDate dueDate;
    private boolean complete;
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public LocalDate getDueDate() {
        return dueDate;
    }
    public void setDueDate(int year, int month, int dayMonth) {
        this.dueDate = LocalDate.of(year, month, dayMonth);
    }
    
    public boolean getComplete() {
        return complete;
    }
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    
    public void createTask() {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Prompt the user for the values of the attributes
        System.out.print("Enter the task description: ");
        userInput = scanner.nextLine();
        setDescription(userInput);

        System.out.print("Due Date of year(yyyy): ");
        int year = scanner.nextInt();
        System.out.print("Due Date of month(mm): ");
        int month = scanner.nextInt();
        System.out.print("Due Date of day(dd): ");
        int day = scanner.nextInt();
        
        setDueDate(year,month,day);

        System.out.print("Enter 'true' if the task is complete or 'false' if it is incomplete: ");
        userInput = scanner.next();
        setComplete(Boolean.parseBoolean(userInput));

        
        scanner.close();

        System.out.println("Task created successfully.");
    }
    
    public static void main(String[] args) {
    	Task task = new Task();
    	task.createTask();
    	System.out.println(task.getDescription());
    	System.out.println(task.getDueDate());
    	System.out.println(task.getComplete());
    	
    }

}
