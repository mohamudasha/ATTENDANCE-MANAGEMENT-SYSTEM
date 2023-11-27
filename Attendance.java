public abstract class Attendance {
    private int admissionNumber;
    private String sName;

    public Attendance(int admissionNumber, String sName) {
        this.admissionNumber = admissionNumber;
        this.sName = sName;
    }

    public  int getAdmissionNumber(){
        return admissionNumber;
    } ;



    public String getsName() {
        return sName;
    }
    public void displaydetails()
    {
        System.out.println("Admission Number"+admissionNumber);
        System.out.println("Student Name"+sName);
    }




}















