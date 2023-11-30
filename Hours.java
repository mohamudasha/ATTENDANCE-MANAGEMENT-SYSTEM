public class Hours {

    private int hours;
    private int presentHours;
    private int absentHours;
    private String status;
     Hours(int hours,int presentHours,int absentHours,String status){

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
