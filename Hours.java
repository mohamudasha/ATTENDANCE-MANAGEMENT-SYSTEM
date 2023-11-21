//class 'Hours' that represent hours related details and inherits 'Attendance' class variables
public class Hours extends Attendance{
    //Private instance variable for storing hours
    private int hours;
    //Pivate instance variable for storing present hours
    private int presentHours;
    //Private instance variable for storing absent hours
    private int absentHours;
    //Private instance variable for storing status
    private String status;

    //Constructor that initialize hours,present hours and absent hours
    public Hours(int hours,int presentHours,int absentHours,String status,int admissionNumber,String sName){
        super(admissionNumber,sName);
        this.hours=hours;
        this.presentHours=presentHours;
        this.absentHours=absentHours;
        this.status=status;
    }
    //Method to retrieve and return hours
    public int getHours(){
        return hours;
    }
    //Method to retrieve and return present hours
    public int getPresentHours(){
        return presentHours;
    }
    //Method to retrieve and return absent hours
    public int getAbsentHours(){
        return absentHours;
    }
    //Method to retrieve and return status
    public String getStatus(){
        if(absentHours==10){
            return "Bad";
        }else{
            return "Good";
        }
    }


}
