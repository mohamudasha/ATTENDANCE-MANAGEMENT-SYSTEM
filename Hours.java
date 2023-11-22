public class Hours extends Attendance{

    private int hours;
    private int presentHours;
    private int absentHours;
    private String status;
    public Hours(int hours,int presentHours,int absentHours,String status,int admissionNumber,String sName){
        super(admissionNumber,sName);
        this.hours=hours;
        this.presentHours=presentHours;
        this.absentHours=absentHours;
        this.status=status;
    }
    public int getHours(){
        return hours;
    }
    public int getPresentHours(){
        return presentHours;
    }
    public int getAbsentHours(){
        return absentHours;
    }
    public String getStatus(){
        if(absentHours>=10){
            return "Bad";
        }else{
            return "Good";
        }
    }


}
