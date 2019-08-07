import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EndOfLesson2ver3 {
    public static void main(String[] args) {

        System.out.println(args[0] + ", lesson 2 is finished");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }


}
