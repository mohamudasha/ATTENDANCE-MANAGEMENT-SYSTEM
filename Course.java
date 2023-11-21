//Course class that inherits variables from Attendance class
public class Course extends Attendance{
    //Private instance variable storing course name
    private String name;
    //Private instance variable storing course code
    private String Coursecode;

//Constructor that initializes course name and course code
    public Course(String name,int admissionNumber,String sName,String Coursecode){
        super(admissionNumber,sName);
        this.name=name;
        this.Coursecode=Coursecode;
    }
    //Method to retrieve and return course name
    public String getName(){
        return name;
    }
    //Method to retrieve and return course code
    public String getCoursecode(){
        return Coursecode;
    }


}

