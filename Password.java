public class Password {
    private String password;
    private String StudentAdmNo;
    private Integer LecID;
    public Password(String password,String StudentAdmNo) {
        this.password = password;
        this.StudentAdmNo=StudentAdmNo;

    }
    public Password(String password,Integer LecID){
        this.password=password;
        this.LecID=LecID;
    }
    public String getPassword() {
        return password;
    }
    public String getStudentAdmNo() {
        return StudentAdmNo;
    }
    public Integer getLecID() {
        return LecID;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    public void setLecID(Integer LecID) {
        this.LecID = LecID;
    }
    public static void main(String[]args){
    Password password1=new Password("124ABC","A123");
    Password password2=new Password("WERT2344",2341);
    System.out.println( "LecturerID"+ password2.getLecID() );
    System.out.println("Password" + password2.getPassword());
    System.out.println( "StudentAdmNo"+ password1.getStudentAdmNo() );
    System.out.println("Password" + password1.getPassword());




    }


}
