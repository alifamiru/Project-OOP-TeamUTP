import java.time.LocalTime;
import java.util.ArrayList;

public class SetSchedule {
    // ATTRIBUTES
    private ArrayList<String> daysOfWeek = new ArrayList<String>();
    private ArrayList<LocalTime> startTime = new ArrayList<LocalTime>();
    private ArrayList<LocalTime> endTime = new ArrayList<LocalTime>();
    private ArrayList<Subject> subjectName = new ArrayList<Subject>();

    // METHODS
    public void addDaysOfWeek(String day) {
        this.daysOfWeek.add(day);
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime.add(startTime);
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime.add(endTime);
    }

    public String getDaysOfWeek(int i) {
        return this.daysOfWeek.get(i);
    }

    public int getindexDay(String day) {
        return this.daysOfWeek.indexOf(day);
    }

    public LocalTime getStartTime(int i) {
        return this.startTime.get(i);
    }

    public LocalTime getEndTime(int i) {
        return this.endTime.get(i);
    }

    public void addSubject(Subject subjectName) {
        this.subjectName.add(subjectName);
    }

    public void removeSubject(int index) {
        this.subjectName.remove(index);
    }

    public int getindexsubject(Subject subjectname) {
        return this.subjectName.indexOf(subjectname);
    }

    // UNIT TESTING
    public static void main(String[] args) {
        SetSchedule schedule1 = new SetSchedule();

        Subject subject1 = new Subject();
        Subject subject2 = new Subject();
        
        // SETTING THE DAYS, START TIME & END TIME OF SUBJECT #1'S CLASS SESSIONS
        schedule1.addDaysOfWeek("Tuesday");
        schedule1.setStartTime(LocalTime.of(14, 0));
        schedule1.setEndTime(LocalTime.of(16,0));
        schedule1.addDaysOfWeek("Friday");
        schedule1.setStartTime(LocalTime.of(8,0));
        schedule1.setEndTime(LocalTime.of(10,0));

        // ADDING SUBJECTS INTO THE SCHEDULE
        schedule1.addSubject(subject1);
        schedule1.addSubject(subject2);

        // REMOVING THE SUBJECT THAT IS NO LONGER TAKEN BY USER
        schedule1.removeSubject(schedule1.getindexsubject(subject2));

        // DISPLAYING SCHEDULE DETAILS
        System.out.println("Your schedule for Subject: Object Oriented Programming");
        for (int i=0; i<schedule1.daysOfWeek.size(); i++) {
            System.out.println("Day: " + schedule1.daysOfWeek.get(i));
            System.out.println("Start Time: " + schedule1.startTime.get(i));
            System.out.println("End Time: " + schedule1.endTime.get(i));
            System.out.println();
        }
        }
    }

