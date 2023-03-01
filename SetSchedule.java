import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class SetSchedule {
    // ATTRIBUTES
    private List<Day> daysOfWeek = new List<Day>();
    private Time startTime;
    private Time endTime;
    private ArrayList<Subject> subjectName = new ArrayList<Subject>();

    // METHODS
    public void setDaysOfWeek(List<Day> daysOfWeek){
        this.daysOfWeek = daysOfWeek;
    }
    public void setStartTime(Time startTime){
        this.startTime = startTime;
    }
    public void setEndTime(Time endTime){
        this.endTime = endTime;
    }

    public List<Day> getDaysOfWeek(){
        return daysOfWeek;
    }
    public Time getStartTime(){
        return startTime;
    }
    public Time getEndTime(){
        return endTime;
    }

    public void addSubject(Subject subjectName){
        this.subjectName.add(subjectName);
    }
    public void removeSubject(int index){
        this.subjectName.remove(index);
    }
}
