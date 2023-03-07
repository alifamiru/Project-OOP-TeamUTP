
import java.time.LocalTime;
import java.util.ArrayList;

public class SetSchedule {
    // ATTRIBUTES
    private ArrayList<String> daysOfWeek = new ArrayList<String>();
    private LocalTime startTime;
    private LocalTime endTime;
    private ArrayList<Subject> subjectName = new ArrayList<Subject>();

    // METHODS
    public void addDaysOfWeek(String day){
        this.daysOfWeek.add(day);
    }
    public void setStartTime(LocalTime startTime){
        this.startTime = startTime;
    }
    public void setEndTime(LocalTime endTime){
        this.endTime = endTime;
    }

    public String getDaysOfWeek(int i){
        return this.daysOfWeek.get(i);
    }

    public int getindexDay(String day) {
        return this.daysOfWeek.indexOf(day);
    }

    public void getStartTime(){
        System.out.println("Start Time: " + this.startTime);
    }
    public void getEndTime(){
        System.out.println("End Time: " + this.endTime);
    }

    public void addSubject(Subject subjectName){
        this.subjectName.add(subjectName);
    }
    public void removeSubject(int index){
        this.subjectName.remove(index);
    }

    public int getindexsubject(Subject subjectname) {
        return this.subjectName.indexOf(subjectname);
    }
}
