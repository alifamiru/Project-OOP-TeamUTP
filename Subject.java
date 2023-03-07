import java.util.ArrayList;
import java.util.Scanner;

public class Subject {
    // ATTRIBUTES
    private String subjectName;
    private String description;
    ArrayList<Lecturer> lecturer = new ArrayList<Lecturer>();
    private String venue;
    private int creditHr;

    // METHODS
    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setLecturer(Lecturer lecturer){
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
    public ArrayList<Lecturer> getLecturer(){
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
        Scanner scanner = new Scanner(System.in);
        Lecturer lec = new Lecturer();

        System.out.print("Subject Name: ");
        String subjectName = scanner.nextLine();
        setSubjectName(subjectName);

        System.out.print("Subject Description: ");
        String description = scanner.next();
        setDescription(description);

        /*
        System.out.print("Name of Lecturer: ");
        Name name = lec.name.getFName;
        setLecturer();
         */

        System.out.print("Venue: ");
        String venue = scanner.nextLine();
        setVenue(venue);

        System.out.print("Credit Hour: ");
        int creditHr = scanner.nextInt();
        setCreditHr(creditHr);
        
        scanner.close();
    }
    // " displaySubject

}
