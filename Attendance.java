//Abstract class 'Attendance' to represent attendance related detail
public abstract class Attendance {
    //Private instance variable for storing admission number
    private int admissionNumber;
    //Private instance variable for storing student name
    private String sName;
//Constructor to initialize admissionNumber and student number variable
    public Attendance(int admissionNumber, String sName) {
        this.admissionNumber = admissionNumber;
        this.sName = sName;
    }
//Retrieves and return admission number
    public  int getAdmissionNumber(){
        return admissionNumber;
    } ;
//Retrieves and return the Student name from the user
    public String getsName() {
        return sName;
    }




}















