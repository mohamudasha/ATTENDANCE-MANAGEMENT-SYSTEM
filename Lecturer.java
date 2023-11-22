public class Lecturer extends Attendance {
    private String Lecname;
    private Integer LecID;

    public Lecturer(String Lecname, int admissionNumber, String sName,Integer LecID) {
        super(admissionNumber, sName);
        this.Lecname = Lecname;
        this.LecID=LecID;
    }
    @java.lang.Override
    public int getAdmissionNumber() {
        return super.getAdmissionNumber();
    }

    public String getLecname() {
        return Lecname;
    }

    public Integer getLecID() {
        return LecID;
    }
}

