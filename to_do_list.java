public class to_do_list {
    ArrayList<Task> list = new ArrayList<Task>;

    public Task getTask(int i){
        return this.list.get(i);
    }
    public void getIndex(int i){
        return this.list.get(i);
    }
    public void addTask(Task task){
        this.list.add(task);
    }
    public void removeTask(int i){
        this.list.remove(i);
    }
    public void editTask(Task task,int i){
        this.list.set(task,i);
    }
}
