import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Abstract class representing a Person
abstract class Person {
    private String name;
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Student extends Person {
    public Student(String name, String id) {
        super(name, id);
    }
}

class AttendanceManager {
    private Map<String, List<Boolean>> attendanceRecords;

    public AttendanceManager() {
        this.attendanceRecords = new HashMap<>();
    }

    public void markAttendance(Student student, boolean present) {
        String studentId = student.getId();
        attendanceRecords.computeIfAbsent(studentId, k -> new ArrayList<>()).add(present);
    }

    public List<Boolean> getAttendance(Student student) {
        return attendanceRecords.getOrDefault(student.getId(), new ArrayList<>());
    }
}

public class StudentAttendance {
    public static void main(String[] args) {
        Student student1 = new Student("Allen Jack", "89");
        Student student2 = new Student("Jackson Andrew", "90");

        AttendanceManager attendanceManager = new AttendanceManager();
        attendanceManager.markAttendance(student1, true);
        attendanceManager.markAttendance(student2, true);
        attendanceManager.markAttendance(student1, false);
        List<Boolean> attendance1 = attendanceManager.getAttendance(student1);
        List<Boolean> attendance2 = attendanceManager.getAttendance(student2);

        System.out.println(student1.getName() + "'s Attendance: " + attendance1);
        System.out.println(student2.getName() + "'s Attendance: " + attendance2);
    }
}

