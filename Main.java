import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner UserInput = new Scanner(System.in);
		int z=0;
		
				StudentInfo student = new StudentInfo();
				System.out.println("First Name:");
				String firstName = UserInput.nextLine();
				student.setfName(firstName);
				System.out.println("Middle Name:");
				String middName = UserInput.nextLine();
				student.setmName(middName);
				System.out.println("Last Name:");
				String lastName = UserInput.nextLine();
				student.setlName(lastName);
				System.out.println("Student ID:");
				String ID = UserInput.nextLine();
				student.setStudentID(ID);
				
				
				
			
			for(int i=0;i<=4;i=z) {	
				System.out.println("Enter Options:");
				System.out.println("1 - CGPA");
				System.out.println("2 - Task");
				System.out.println("3 - Schedule");
				System.out.println("4 - return");
				
				i = UserInput.nextInt();
				
				if(i==1) { // Continue cgpa
					
			        CGPA semester = new CGPA();
			        ListOfCGPA User = new ListOfCGPA();
			        int index = 0;
			        int option=0;

			       
			        
				
				
				
		}

	}

}}
