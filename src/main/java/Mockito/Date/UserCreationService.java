package Mockito.Date;

import java.time.ZonedDateTime;

public class UserCreationService {

    public User createUser(String name){
        return new User(name, ZonedDateTime.now());
    }
}
