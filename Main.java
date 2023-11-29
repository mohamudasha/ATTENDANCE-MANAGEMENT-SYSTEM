public class Main {
    public static void main(String [] args){
       Unit unit1=new Unit("OOP",1204);
       Unit unit2=new Unit("S.A.D",1205);
       unit2.setUnitName("System Analysis");
       unit2.setUnitNo( 1207);
       System.out.println(unit1.getUnitName());
        System.out.println(unit1.getUnitNo());
        System.out.println(unit2.getUnitName());
        System.out.println(unit2.getUnitNo());

        Course course1=new Course("DBIT",2034);
        Course course2=new Course("DIR",2036);
        course2.setCoursecode(2035);
        System.out.println(course2.getCoursecode());
        }
    }

