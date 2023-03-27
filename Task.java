import java.time.LocalDate;
import java.util.Scanner;

public class Task extends TaskType{
    

	private String description;
    private LocalDate dueDate;
    private boolean complete;
    private String taskType;
    
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
    
    public String gettaskType() {
		return this.taskType;
	}
	public void settaskType(String taskType) {
		this.taskType = taskType;
	}
	public void createTask() {
        Scanner scanner = new Scanner(System.in);
        String userInput;
        

        // Prompt the user for the values of the attributes
        System.out.println("Task types:");
        for (int i = 0; i < this.type.size(); i++) {
            System.out.println(i + ": " + this.type.get(i));
        }
        System.out.println("Enter task type: ");
        int IntuserInput = scanner.nextInt();
        this.settaskType(this.getType(IntuserInput));
 
        scanner.nextLine();
        
        
        System.out.println("Enter the task description: ");
        	userInput = scanner.nextLine();
            this.setDescription(userInput);
       
            
         
        

        System.out.println("Enter due date (yyyy/mm/dd): ");
        	int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            this.setDueDate(year,month,day);
        
            
        
        
        
        
        
        System.out.println("Enter 'true' if the task is complete or 'false' if it is incomplete: ");
        	
        userInput = scanner.next();
        this.setComplete(Boolean.parseBoolean(userInput));
        	
        System.out.println("Task created successfully.");
    
        }
    
    public void displayTask() {
    	System.out.println("Task type: "+this.type);
    	System.out.println("Task description: "+this.getDescription());
    	System.out.println("Due date: "+this.getDueDate());
    	if(this.complete==true) {
    	System.out.println("Completion: Done");
    	}
    	else {
    		System.out.println("Completion: Not done");
    	}
    }
    
    public static void main(String[] args) {
    	Task test = new Task();
    	test.addType("testing");
    	test.createTask();
    	test.displayTask();
    	
    	
    }

}