import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Task task = new Task();
		to_do_list todoList = new to_do_list();
		
		
				StudentInfo student = new StudentInfo();
				System.out.println("First Name:");
				String firstName = scanner.nextLine();
				student.setfName(firstName);
				System.out.println("Middle Name:");
				String middName = scanner.nextLine();
				student.setmName(middName);
				System.out.println("Last Name:");
				String lastName = scanner.nextLine();
				student.setlName(lastName);
				System.out.println("Student ID:");
				String ID = scanner.nextLine();
				student.setStudentID(ID);
				
				
				
			
			for(int i=0;i<4;) {	
				System.out.println("Enter Options:");
				System.out.println("1 - CGPA");
				System.out.println("2 - Task");
				System.out.println("3 - Schedule");
				System.out.println("4 - exit");
				
				i = scanner.nextInt();
				
				if(i==1) { // Continue cgpa
					
			        CGPA semester = new CGPA();
			        ListOfCGPA User = new ListOfCGPA();
			        int index = 0;
			        int option=0;
				}
				else if(i==2) {
				for(int k=0;k<6;) {
					
					
				System.out.println("Enter Option:\n1 - Create Task\n2 - Delete Task\n3 -  Check Task\n4 - Display Tasks\n5 - Create Task Type\n6 - Return\n");
				
					
					 k = scanner.nextInt();
					
					
				
				
				if(k==1) {
					
					task.createTask();
					todoList.addTask(task);
					k=0;

					}
				else if(k==2) {
					for(int i1=0;i1<todoList.list.size();i1++) {
					System.out.println(i1 +" - "+ todoList.getTask(i1).getDescription());
					}
					System.out.println("Enter number:");
					int removal = scanner.nextInt();
					todoList.removeTask(removal);
				}
				else if(k==3) {
					for(int i1=0;i1<todoList.list.size();i1++) {
						System.out.println(i1 +" - "+ todoList.getTask(i1).getDescription());
						}
					System.out.println("Enter task number:");
					int taskNumber=scanner.nextInt();
					if(todoList.getTask(taskNumber).getComplete()) {
						System.out.println("The task has been completed.\n");
					}
					else {
					Reminder.checkTaskStatus(todoList.getTask(taskNumber));
					System.out.println("\n");
					}
				}
				else if(k==4) {
					for(int i1=0;i1<todoList.list.size();i1++) {
						System.out.println("No. "+i1);
						todoList.getTask(i1).displayTask();
						System.out.println("\n");
						
					}
				}
				else if(k==5) {
					scanner.nextLine();
					System.out.println("Enter new task type:");
					String typeuserInput = scanner.nextLine();
					task.addType(typeuserInput);
				}
				else {
					k=6;
				}
			    
			   }
				}
				else if(i==3) {
				
				}
				else if (i==4) {
					break;
				}

			       
			        
				
				
				
		

	}

}}
