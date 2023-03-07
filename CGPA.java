
import java.util.Scanner;
public class CGPA {
    //data attributes
    private int creditHour;
    private int fullCreditHour;
    private String grade;
    private int numOfSubject;
    private double point;
    private double totalPoint;
    private double gpa;
    private int semester;

    //methods of operation
    public double calcGPA(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subject: ");
        numOfSubject = scanner.nextInt();
        for (int i = 0; i < numOfSubject; i++){
            System.out.print("Enter credit hour: ");
            creditHour = scanner.nextInt();
            System.out.print("Enter grade: ");
            grade = scanner.next();
            switch (grade){
                case "A":
                    point = creditHour * 4.00;
                    break;
                case "A-":
                    point = creditHour * 3.75;
                    break;
                case "B+":
                    point = creditHour * 3.50;
                    break;
                case "B":
                    point = creditHour * 3.00;
                    break;
                case "C+":
                    point = creditHour * 2.50;
                    break;
                case "C":
                    point = creditHour * 2.00;
                    break;
                case "D+":
                    point = creditHour * 1.50;
                    break;
                case "D":
                    point = creditHour * 1.00;
                    break;
                case "F":
                    point = creditHour * 0.00;
                    break;
            }
            totalPoint += point;
            fullCreditHour += creditHour;
        }
        scanner.close();
        gpa = totalPoint / fullCreditHour;
        return gpa;
    }
    public void displayGPA(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter semester: ");
        semester = scanner.nextInt();
        System.out.println("Your GPA for semester "+ semester + " : " + String.format("%.2f", gpa));
        scanner.close();
    }

}