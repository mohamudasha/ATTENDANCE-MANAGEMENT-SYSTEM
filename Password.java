public class Password {
    private String password;
    private String StudentAdmNo;
    private Integer LecID;
    private Password(String password,String StudentAdmNo) {
        this.password = password;
        this.StudentAdmNo=StudentAdmNo;

    }
    private Password(String password,Integer LecID){
        this.password=password;
        this.LecID=LecID;
    }
    private String getPassword() {
        return password;
    }
    private String getStudentAdmNo() {
        return StudentAdmNo;
    }
    private Integer getLecID() {
        return LecID;
    }


    private void setPassword(String password) {
        this.password = password;
    }
    private void setLecID(Integer LecID) {
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
