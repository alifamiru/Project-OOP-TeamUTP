import java.time.LocalDate;

public class Reminder {    
  public static void main(String[] args) {    
      Task task = new Task();
   task.setDueDate(2023, 12, 12);
   LocalDate now = LocalDate.now(); 
   LocalDate DUEDATE = task.getDueDate();

      LocalDate date1 = now;
        LocalDate date2 = DUEDATE;
       
        
        System.out.println("date1 : " + date1);
        System.out.println("date2 : " + date2);

        int result = date1.compareTo(date2);
        System.out.println("result: " + result);

        if (result == 0) {
            System.out.println("The Duedate is TODAY!");
        } else if (result > 0) {
            System.out.println("Your Task is OVERDUE!");
        } else if (result < 0) {
            System.out.println("You have upcoming duedate!");
        } else {
            System.out.println("INVALID");
        }
}}
