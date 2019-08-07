import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;
public class EndOfLesson2ver2 {
    public static void main(String[] args) {
        EndOfLesson2.showNameAndTime();
    }

    public static void showNameAndTime() {
        Scanner user_input = new Scanner( System.in );
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        String name;
        System.out.print("Enter your name: ");
        name = user_input.next( );

        String surname;
        System.out.print("Enter your surname: ");
        surname = user_input.next( );

        String full_name;
        full_name = name + " " + surname;

        System.out.println(full_name + "," + " lesson 2 is finished,");

        System.out.println(dtf.format(now));
    }
}