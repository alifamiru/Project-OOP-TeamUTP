import java.util.ArrayList;
public class TaskType {
     private ArrayList<String> type = new ArrayList<String>();


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