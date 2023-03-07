import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class SetSchedule {
    // ATTRIBUTES
    private ArrayList<String> daysOfWeek = new ArrayList<String>();
    private Time startTime;
    private Time endTime;
    private ArrayList<Subject> subjectName = new ArrayList<Subject>();

    // METHODS
    public void addDaysOfWeek(String day){
        this.daysOfWeek.add(day);
    }
    public void setStartTime(Time startTime){
        this.startTime = startTime;
    }
    public void setEndTime(Time endTime){
        this.endTime = endTime;
    }

    public String getDaysOfWeek(int i){
       return this.daysOfWeek.get(i);
    }
    
    public int getindexDay(String day) {
    	return this.daysOfWeek.indexOf(day);
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
    
    public int getindexsubject(Subject subjectname) {
    	return this.subjectName.indexOf(subjectname);
    }
}