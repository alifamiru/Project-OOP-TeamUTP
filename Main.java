public class Main
{
    public static void main(String[] args) {

        StudentInfo myobj = new StudentInfo() ;
        //	myobj.setName("Muhamad Adam Irfan Bin Mohd Nizam") ; //part must be sync with class name
        myobj.setStudentID("22006433") ;
        myobj.setStudentFaculty("Faculty of Science and Information Technology") ;
        myobj.setStudentProgramme("Bachelor of Computer Science") ;
        myobj.setStudentYear("1st Year") ;
        myobj.setStudentSemester("1st Semester") ;

        System.out.println("**UTP Student Information**") ;
        //	System.out.println("Name : "+myobj.getName()) ; //part must be sync with class name
        System.out.println("Student ID        : " +myobj.getStudentID()) ;
        System.out.println("Student Faculty   : " +myobj.getStudentFaculty()) ;
        System.out.println("Student Programme : " +myobj.getStudentProgramme()) ;
        System.out.println("Student Year      : " +myobj.getStudentYear()) ;
        System.out.println("Student Semester  : " +myobj.getStudentSemester()) ;

    }
}