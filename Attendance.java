public abstract class Attendance {
    private int admissionNumber;
    private String StudentName;

    public Attendance(int admissionNumber, String StudentName) {
        this.admissionNumber = admissionNumber;
        this.StudentName = StudentName;
    }

    public  int getAdmissionNumber(){
        return admissionNumber;
    } ;



    public String getStudentName() {
        return StudentName;
    }




}















