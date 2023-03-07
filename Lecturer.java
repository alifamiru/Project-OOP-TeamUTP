import java.util.Scanner;

public class Lecturer{
    private Name name;
    private String officeAddr;
    private String officeNum;
    private String phoneNum;
    private String email;


    public void setName(Name name) {
        this.name = name;
    }

    public void setOfficeAddr(String officeAddr) {
        this.officeAddr = officeAddr;
    }

    public void setOfficeNum(String officeNum) {
        this.officeNum = officeNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createLecturer() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Office room: ");
        String officeAddr = scanner.next();
        setOfficeAddr(officeAddr);

        System.out.print("Office number: ");
        String officeNum = scanner.next();
        setOfficeNum(officeNum);

        System.out.print("Lecturer's phone number: ");
        String phoneNum = scanner.next();
        setPhoneNum(phoneNum);

        System.out.print("Lecturer's email: ");
        String email = scanner.next();
        setEmail(email);
        
        scanner.close();

    }

    public void displayLecturer() {
        System.out.println("Name: " + this.name);
        System.out.println("Office room: " + this.officeAddr);
        System.out.println("office number: " + this.officeNum);
        System.out.println("Phone number: " + this.phoneNum);
        System.out.println("Email: " + this.email);
    }


}