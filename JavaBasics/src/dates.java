import java.time.*;
import java.time.format.DateTimeFormatter;

public class dates {
    public static void main(String[] args){
        //now() is use to get current time and date
        //DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.
        //T is used to separate date and time
        LocalDateTime myTime = LocalDateTime.now();
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("E dd/MM/yy HH:mm:ss");
        String formatedObj = myTime.format(formatObj);
        System.out.println(formatedObj);
    }
}
