package Mockito.Date;

import java.time.ZonedDateTime;

public class DateTimeProvider {

    public ZonedDateTime currentZonedTime(){
        return ZonedDateTime.now();
    }
}
