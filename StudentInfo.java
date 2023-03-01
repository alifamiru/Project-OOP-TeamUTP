public class StudentInfo {

    // private Name name ; //Student Name
    private String StudentID ; //Student ID
    private String StudentFaculty; //Student Faculty
    private String StudentProgramme ; //Student Programme
    private String StudentYear ; // Student Year
    private String StudentSemester ; // Student Semester

    /*Setter method*/
    /* public void setName(Name name){
        this.name = name ;
    } */
    public void setStudentID(String StudentID){
        this.StudentID = StudentID ;
    }
    public void setStudentFaculty(String StudentFaculty){
        this.StudentFaculty = StudentFaculty;
    }
    public void setStudentProgramme(String StudentProgramme){
        this.StudentProgramme = StudentProgramme ;
    }
    public void setStudentYear(String StudentYear){
        this.StudentYear = StudentYear ;
    }
    public void setStudentSemester(String StudentSemester){
        this.StudentSemester = StudentSemester ;
    }

    /* getter method */

    /* public Name getName(){
        return name ;
    } */
    public String getStudentID(){
        return StudentID ;
    }
    public String getStudentFaculty(){
        return StudentFaculty;
    }
    public String getStudentProgramme(){
        return StudentProgramme ;
    }
    public String getStudentYear(){
        return StudentYear ;
    }
    public String getStudentSemester(){
        return StudentSemester ;
    }

}
