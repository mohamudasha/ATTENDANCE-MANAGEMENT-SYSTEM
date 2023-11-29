
    public  class Attendance {
        // Private member variables to store student name, total classes, and classes attended.
        private String StudentName;
        private int StudentID;
        private int totalClasses;
        private int classesAttended;
        //Constructor that analyzes the student name,total classes and classes attended
        public Attendance(String StudentName, int StudentID, int totalClasses) {
            this.StudentName = StudentName;
            this.StudentID = StudentID;
            this.totalClasses = totalClasses;
            this.classesAttended = classesAttended;
        }

        // Getter method to retrieve and return student name
        public String getStudentName() {

            return StudentName;
        }
        public int getStudentID(){

            return StudentID;
        }
        //Getter method to retrieve and return total number of classes
        public int getTotalClasses() {
            return totalClasses;
        }
        //Getter method to retrieve and return classes attended
        public int getClassesAttended() {
            return classesAttended;
        }
        //Method to update number of classes attended
        public void updateAttendance(int classesAttended) {
            //Check for valid range of classes attended
            if (classesAttended >= 0 && classesAttended <= totalClasses && totalClasses > 0) {
                this.classesAttended = classesAttended;
            } else {
                System.out.println("Invalid number of classes attended.");
            }
        }
        //Method to calculate and return attendance percentage
        public double calculateAttendancePercentage() {
            //Check for valid range of total number of classes
            if (totalClasses > 0) {
                return ((double) classesAttended / totalClasses) * 100;
            } else {
                return 0.0;
            }
        }
        // Main method to demonstrate the functionality of Attendance class.
        public static void main(String[] args) {
            // Creating an instance of Attendance.
            Attendance student1 = new Attendance("Johnny Sane", 20, 15);

            // Accessing and display of student attendance details using getter methods
            System.out.println("Student Name: " + student1.getStudentName());
            System.out.println("Student ID: " + student1.getStudentID());
            System.out.println("Total Classes: " + student1.getTotalClasses());
            System.out.println("Classes Attended: " + student1.getClassesAttended());
            // Updating attendance and displaying the updated attendance percentage.
            student1.updateAttendance(18);
            System.out.println("Attendance Percentage: " + student1.calculateAttendancePercentage() + "%");
        }
    }
