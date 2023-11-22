public class Lecturer extends Attendance {
    private final String Lecname;
    private final Integer LecID;

    public Lecturer(String Lecname, int admissionNumber, String sName, Integer LecID) {
        super(admissionNumber, sName);
        this.Lecname = Lecname;
        this.LecID = LecID;
    }

    public String getLecname() {
        return Lecname;
    }

    public Integer getLecID() {
        return LecID;
    }

    @Override
    public void displayDetails() {
        System.out.println("Lecturer details:");
        System.out.println("Name: " + Lecname);
        System.out.println("ID: " + LecID);
    }
}
