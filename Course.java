public class Course extends Attendance{
    private String name;
    private String admin;

    public Course(String name,String admin,int adminNumber,String Sname){
        super(adminNumber,Sname);
        this.name=name;
        this.admin=admin;
    }
    public String getName(){
        return name;
    }
    public String getAdmin(){
        return admin;
    }}

