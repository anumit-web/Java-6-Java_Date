/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode6.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode6
*/

// import
import java.time.*;

public class JavaCode6 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 6");
        System.out.println("Java - Dates");
        System.out.println("");

        // Display Current Date            
        LocalDate myObj = LocalDate.now();
        System.out.println("Display Current Date is = " + myObj);

        // Display Current Time
        LocalTime myObj2LocalTime = LocalTime.now();
        System.out.println("Display Current Time is = " + myObj2LocalTime);

        // Display Current Date and Time
        LocalDateTime myObjLocalDateTime = LocalDateTime.now();
        System.out.println("Display Current Date and Time is = " + myObjLocalDateTime);
    }
}