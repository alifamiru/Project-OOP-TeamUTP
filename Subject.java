import java.util.ArrayList;
import java.util.Scanner;

public class Subject {
    // ATTRIBUTES
    private String subjectName;
    private String description;
    ArrayList<Name> lecturer = new ArrayList<>();
    private String venue;
    private int creditHr;

    // METHODS
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setLecturer(Name lecturer){
        this.lecturer.add(lecturer);
    }
    public void setVenue(String venue){
        this.venue = venue;
    }
    public void setCreditHr(int creditHr){
        this.creditHr = creditHr;
    }

    public String getSubjectName(){
        return subjectName;
    }
    public String getDescription(){
        return description;
    }
    public ArrayList<Name> getLecturer(){
        return lecturer;
    }
    public String getVenue(){
        return venue;
    }
    public int getCreditHr(){
        return creditHr;
    }

    //method createSubject -- buat kat Main class?
    public void createSubject(){
        System.out.println("----------Subject's Details----------");

        Scanner scanner = new Scanner(System.in);
        Lecturer lec = new Lecturer();

        System.out.print("Subject Name: ");
        String subjectName = scanner.nextLine();
        setSubjectName(subjectName);

        System.out.print("Subject Description: ");
        String description = scanner.nextLine();
        setDescription(description);


        System.out.print("Name of Lecturer: ");
        Name name = lec.getName();
        setLecturer(name);


        System.out.print("\nVenue: ");
        String venue = scanner.nextLine();
        setVenue(venue);

        System.out.print("Credit Hour: ");
        int creditHr = scanner.nextInt();
        setCreditHr(creditHr);

        scanner.close();

        System.out.println("Subject's details created successfully.");
    }

    public void displaySubject(){
        System.out.println("Subject Name: " + getSubjectName());
        System.out.println("Subject Description: " + getDescription());
        System.out.println("Lecturer's Name: " + getLecturer());
        System.out.println("Venue: " + getVenue());
        System.out.println("Credit Hour: " + getCreditHr());
    }
}
