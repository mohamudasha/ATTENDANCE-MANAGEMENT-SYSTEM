public class Unit extends Attendance{
    private String unitName;
    public Unit(String unitName,int admissionNumber,String StudentName){
        super(admissionNumber,StudentName);
    }
    public String getUnitName(){
        return unitName;
    }

    }


