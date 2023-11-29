public class Course {
    private String Coursename;
    private Integer Coursecode;

     Course(String Coursename,Integer Coursecode){

        this.setCoursename(Coursename);
        this.setCoursecode(Coursecode);
    }
    public String getCoursename(){
        return Coursename;
    }
    public Integer getCoursecode(){
        return Coursecode;
    }

    public void setCoursename(String coursename) {
     this.Coursename = coursename;
    }

    public void setCoursecode(Integer coursecode) {
        this.Coursecode=coursecode;
    }
}

