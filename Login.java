// Class 'Login' encapsulating the Attendance inner class
public class Login{
    // Static inner class 'Attendance' representing attendance details of a student
    public static class Attendance {
        //Private instance variable storing student name
        private String studentName;
        //Private instance variable storing total number of classes
        private int totalClasses;
        //Private instance variable storing classes attended
        private int classesAttended;
        //Constructor to initialize student name,total classes and classes attended
        public Attendance(String studentName, int totalClasses, int classesAttended) {
            this.studentName = studentName;
            this.totalClasses = totalClasses;
            this.classesAttended = classesAttended;
        }

        // Getter method to retrieve and return student name
        public String getStudentName() {
            return studentName;
        }
        //Getter method to retrieve and return total number of classes
        public int getTotalClasses() {
            return totalClasses;
        }
        //Getter method to retrieve and return calasses attended
        public int getClassesAttended() {
            return classesAttended;
        }
        //Setter method to update attendance
        public void updateAttendance(int classesAttended) {
            if (classesAttended >= 0 && classesAttended <= totalClasses && totalClasses > 0) {
                this.classesAttended = classesAttended;
            } else {
                System.out.println("Invalid number of classes attended.");
            }
        }
        //Method to calculate and return attendance percentage
        public double calculateAttendancePercentage() {
            if (totalClasses > 0) {
                return ((double) classesAttended / totalClasses) * 100;
            } else {
                return 0.0;
            }
        }
        //Main method to execute the program
        public static void main(String[] args) {
            Attendance student1 = new Attendance("John Doe", 20, 15);

            // Print student details using getter method
            System.out.println("Student Name: " + student1.getStudentName());
            System.out.println("Total Classes: " + student1.getTotalClasses());
            System.out.println("Classes Attended: " + student1.getClassesAttended());
            // Updating attendance and printing the updated attendance percentage
            student1.updateAttendance(18);
            System.out.println("Attendance Percentage: " + student1.calculateAttendancePercentage() + "%");
        }
    }
}