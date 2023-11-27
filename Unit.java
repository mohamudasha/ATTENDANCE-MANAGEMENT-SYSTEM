public class Unit extends Attendance{
    private int unitName;
    public Unit(int unitName,int admissionNumber,String sName)
    {
        super(admissionNumber,sName);

    }
    public int getUnitName(){
        return unitName;
    }

    }


