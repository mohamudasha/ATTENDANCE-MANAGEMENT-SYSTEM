public class Lecturer extends Attendance {
    private String Lecname;

    public Lecturer(String Lecname, int adminNumber, String Sname) {
        super(adminNumber, Sname);
        this.Lecname = Lecname;
    }
    @java.lang.Override
    public int getAdminnumber() {
        return super.getAdminnumber();
    }

    public String getLecname() {
        return Lecname;
    }
}

