import java.util.ArrayList;
import java.util.Scanner;
public class TaskType {
    public final ArrayList<String> type;

    public TaskType(ArrayList<String> type) {
        this.type = type;
    }

    public int getIndex(String type) {
        return this.type.indexOf(type);
    }

    public String getType(int index) {
        return this.type.get(index);
    }

    public void removeType(int index) {
        this.type.remove(index);
    }

    public void addType(String type) {
        this.type.add(type);
    }
}
    
    
    
    
    
    