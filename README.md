# ATTENDANCE MANAGEMENT SYSTEM
#In this code there are concepts such as: encapsulation, abstractions, inheritance, polymorphism.

#Attendance management system is mostly about automating the pen and paper attendance process.
#We have the attendance class as the abstract class which is also the parent class which has children classes derived from it.
#Attendance class has fields like AdmissionNumber,StudentName this shall automatically be derived by the subclasses.
 #Subclasses are:
               1.Course
               2.Unit
               3.Lecturer
               4.Hours
#We have methods to get Unit Name , Student name,AdmissionNumber among others
#We have the assumption that the lecturer or student logins to the system , inserts their ID Number or Admission Number
   and their passwords.Lecturer can update the attendance however students can only view the attendance and comment on it.
#We constructed a basic GUI that shows the interface when either student or Lecturer logins to the system.We have a password 
  class where lecturers and students can set their passwords and it has methods to get passwords.
#The hours class shows classes where the student was present and where they were absent.
#The login class has methods where attendance can be updated and attendance percentage can be calculated.
#The system's main shortcoming was we were unable to create a detailed GUI that could show an attendance record of a student 
and student logins and comments on it or lecturer logins and edits the attendance of a student.
#In coming up with the GUI we watched the YouTube video "Java GUI Tutorial-Make a Login GUI" by Alex Lee to guide us on how to go about the GUI.

 
