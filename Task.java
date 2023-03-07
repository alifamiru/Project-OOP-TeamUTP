import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Task {
    private String description;
    private LocalDate dueDate;
    private boolean complete;
    private String type;
    
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
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    
    public void createtask() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String userInput;

        // Prompt the user for the values of the attributes
        System.out.print("Enter the task description: ");
        userInput = scanner.nextLine();
        setDescription(userInput);

        System.out.print("Due Date (dd/MM/yyyy): ");
        String dueDateStr = scanner.nextLine();
        try {
            Date dueDate = dateFormat.parse(dueDateStr);
            setDueDate(dueDate);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in dd/MM/yyyy format.");
        }

        System.out.print("Enter 'true' if the task is complete or 'false' if it is incomplete: ");
        userInput = scanner.nextLine();
        setComplete(Boolean.parseBoolean(userInput));

        System.out.print("Enter the type of task: ");
        userInput = scanner.nextLine();
        setType(userInput);
        
        scanner.close();

        System.out.println("Task created successfully.");
    }
}
