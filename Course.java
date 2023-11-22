public class Course extends Attendance{
    private final String name;

    public Course(String name,int admissionNumber,String sName){
        super(admissionNumber,sName);
        this.name=name;
    }
    public String getName(){
        return name;
    }


}

