import java.util.Scanner;
public class ListOfCGPA {
    //data attributes
    private int numOfSemester;
    private double cgpa;
    private double gpa;
    private double totalGPA;
    //methods of operations

    public double calcCGPA(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of semester: ");
        numOfSemester = scanner.nextInt();
        for(int i = 0; i < numOfSemester; i++){
            System.out.print("Enter gpa for semester " + (i+1) + " : ");
            gpa = scanner.nextDouble();
            totalGPA += gpa;
        }
        cgpa = totalGPA/numOfSemester;
        scanner.close();
        return cgpa;
    }

}