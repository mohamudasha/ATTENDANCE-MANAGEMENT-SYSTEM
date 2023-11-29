public class Unit {
    private String unitName;
    private Integer unitNo;
     Unit(String unitName,Integer unitNo){
        this.setUnitName(unitName);
        this.setUnitNo(unitNo);
    }
    public String getUnitName()
    {
        return unitName;
    }
    public Integer getUnitNo()
    {
        return unitNo;
    }


    public void setUnitName(String unitName)
    {
        this.unitName=unitName;
    }
    public void setUnitNo(Integer unitNo)
    {
        this.unitNo=unitNo;
    }}

