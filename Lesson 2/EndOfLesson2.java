import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class EndOfLesson2 {
    public static void main(String[] args) {
        EndOfLesson2.showNameAndTime("Eugene", "Bujanov");
    }

    public static void showNameAndTime(String name, String surname) {

        System.out.println(name + " " + surname + "," + " lesson 2 is finished,");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}