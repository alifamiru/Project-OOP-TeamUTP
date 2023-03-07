import java.util.ArrayList;

public class to_do_list {
    ArrayList<Task> list = new ArrayList<Task>();

    public Task getTask(int i){
        return this.list.get(i);
    }
    public int getIndex(Task task){
        return this.list.indexOf(task);
    }
    public void addTask(Task task){
        this.list.add(task);
    }
    public void removeTask(int i){
        this.list.remove(i);
    }
    public void editTask(Task task,int i){
        this.list.set(i,task);
    }

    public static void main(String[] args) {
        to_do_list face = new to_do_list();
        Task A = new Task();
        TaskType A_type = new TaskType();
        A_type.addType("Work");
        A.setType(A_type.getType(0));
        face.addTask(A);
        System.out.println(face.getIndex(A) +" "+ face.getTask(0).getType());

    }
}
