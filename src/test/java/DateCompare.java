import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("date 비교")
public class DateCompare {

    @Test
    @DisplayName("java.util.Date org.joda.time.LocalDateTime 비교")
    public void compare(){

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        System.out.println(new Date().toString());
        System.out.println(LocalDateTime.now().toString());
        System.out.println(LocalDateTime.now());

        System.out.println(new Date());

        String test = LocalDateTime.now().toString();



    }

}
