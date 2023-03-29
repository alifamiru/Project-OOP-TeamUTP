public class StudentInfo extends Name{

    private String StudentID ; //Student ID
    private to_do_list ToDoList;
    private ListOfCGPA cgpa;

    /*Setter method*/
    public void setStudentID(String StudentID){
        this.StudentID = StudentID ;
    }
    public void setToDoList(to_do_list ToDoList) {
		this.ToDoList = ToDoList;
	}
    public void setCgpa(ListOfCGPA cgpa) {
		this.cgpa = cgpa;
	}

    /* getter method */

    
	public String getStudentID(){
        return StudentID ;
    }
    public to_do_list getToDoList() {
		return ToDoList;
	}
    public ListOfCGPA getCgpa() {
    	return cgpa;
    }
	
	

}