public class Attendance {
    private int admiNumber;
    private String Sname;

    public Attendance(int admiNumber,String Sname){
        this.admiNumber=admiNumber;
        this.Sname=Sname;
    }
    public int getAdminumber(){
        return admiNumber;
    }
    public String getSname(){
        return Sname;
    }

    public class Course extends Attendance{
        private String name;
        private String admin;

        public Course(String name,String admin,int admiNumber,String Sname){
            super(admiNumber,Sname);
            this.name=name;
            this.admin=admin;
        }
        public String getName(){
            return name;
        }
        public String getAdmin(){
            return admin;
        }

        public class Unit extends Attendance{
            private String Unitname;
            public Unit(String Unitname,int admiNumber,String Sname){
                super(admiNumber,Sname);
                this.Unitname=Unitname;
            }
            public String getUnitname(){
                return Unitname;
            }

            public class Lecturer extends Attendance {
                private String Lecname;

                public Lecturer(String Lecname, int admiNumber, String Sname) {
                    super(admiNumber, Sname);
                    this.Lecname = Lecname;
                }

                @java.lang.Override
                public int getAdminumber() {
                    return super.getAdminumber();
                }

                public String getLecname() {
                    return Lecname;
                }
            }

            public class Hours extends Attendance{

                private int hours;
                private int presentHours;
                private int absentHours;
                private String status;
            public Hours(int hours,int presentHours,int absentHours,String status,int admiNumber,String Sname){
                super(admiNumber,Sname);
                this.hours=hours;
                this.presentHours=presentHours;
                this.absentHours=absentHours;
                this.status=status;
            }
            public int getHours(){
               return hours;
            }
            public int getPresentHours(){
                return presentHours;
            }
            public int getAbsentHours(){
                return absentHours;
            }
            public String getStatus(){
              if(absentHours==10){
                 return "Bad";
              }else{
                  return "Good";
              }
            }
        }
    }
}}
