// Main class containing the entry point of the program
public class Main {
    // The main method, which is the entry point for any Java application
    public static void main(String [] args){
        // Creating an instance of the Unit class with specific details
        // 'unit' is the object name, and it's being initialized with the Unit name "OOP", an identifier 1234, and the student name "Sally"
        Unit unit=new Unit("OOP",1234,"Sally");
        // Calling the getunitName method on the unit object
        // This method call is used to retrieve the name of the unit, but currently, its return value is not being used or displayed
        unit.getunitName();
        }
    }

