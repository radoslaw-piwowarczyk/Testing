package Mockito.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserCreationTest {

    @Test
    void shouldSetCreationDate() {
        //given
        UserCreationService userCreationService = new UserCreationService();

        //when
        User user = userCreationService.createUser("Admin");

        //then
        Assertions.assertThat(user.getCreationDate()).isNotNull();
    }
}
