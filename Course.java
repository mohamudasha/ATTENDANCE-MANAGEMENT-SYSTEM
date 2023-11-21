public class Course extends Attendance{
    private String name;
    private String Coursecode;

    public Course(String name,int admissionNumber,String sName,String Coursecode){
        super(admissionNumber,sName);
        this.name=name;
        this.Coursecode=Coursecode;
    }
    public String getName(){
        return name;
    }
    public String getCoursecode(){
        return Coursecode;
    }


}

