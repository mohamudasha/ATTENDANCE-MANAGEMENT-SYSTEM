public class Lecturer extends Attendance {
    private final String Lecname;
    private final Integer LecID;

    public Lecturer(String Lecname, int admissionNumber, String StudentName, Integer LecID) {
        super(admissionNumber, StudentName);
        this.Lecname = Lecname;
        this.LecID = LecID;
    }

    public String getLecname() {
        return Lecname;
    }

    public Integer getLecID() {
        return LecID;
    }


    public void displayDetails() {
        System.out.println("Lecturer details:");
        System.out.println("Name: " + Lecname);
        System.out.println("ID: " + LecID);
    }

}
