public class Login{
    public static class Attendance {
        private String studentName;
        private int totalClasses;
        private int classesAttended;
        public Attendance(String studentName, int totalClasses, int classesAttended) {
            this.studentName = studentName;
            this.totalClasses = totalClasses;
            this.classesAttended = classesAttended;
        }

        // Getter methods
        public String getStudentName() {
            return studentName;
        }

        public int getTotalClasses() {
            return totalClasses;
        }

        public int getClassesAttended() {
            return classesAttended;
        }
        public void updateAttendance(int classesAttended) {
            if (classesAttended >= 0 && classesAttended <= totalClasses && totalClasses > 0) {
                this.classesAttended = classesAttended;
            } else {
                System.out.println("Invalid number of classes attended.");
            }
        }
        public double calculateAttendancePercentage() {
            if (totalClasses > 0) {
                return ((double) classesAttended / totalClasses) * 100;
            } else {
                return 0.0;
            }
        }
        public static void main(String[] args) {
            Attendance student1 = new Attendance("Charlie Davidson", 30, 25);
            Attendance student2 = new Attendance("Alaya Sane", 20, 15);

            // Accessing data using getter methods
            System.out.println("Student Name: " + student1.getStudentName());
            System.out.println("Total Classes: " + student1.getTotalClasses());
            System.out.println("Classes Attended: " + student1.getClassesAttended());
            student1.updateAttendance(18);
            System.out.println("Attendance Percentage: " + student1.calculateAttendancePercentage() + "%");
        }
    }
}