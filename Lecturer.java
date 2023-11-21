public class Lecturer extends Attendance {
    private final String Lecname;

    public Lecturer(String Lecname, int admissionNumber, String sName) {
        super(admissionNumber, sName);
        this.Lecname = Lecname;
    }
    @java.lang.Override
    public int getAdmissionNumber() {
        return super.getAdmissionNumber();
    }

    public String getLecname() {
        return Lecname;
    }
}

