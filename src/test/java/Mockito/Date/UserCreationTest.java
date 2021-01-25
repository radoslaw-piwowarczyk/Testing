package Mockito.Date;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

public class UserCreationTest {

    @Test
    void shouldSetCreationDate() {
        //given
        DateTimeProvider dateTimeProvider = new DateTimeProvider();
        UserCreationService userCreationService = new UserCreationService(dateTimeProvider);

        //when
        User user = userCreationService.createUser("Admin");

        //then
        Assertions.assertThat(user.getCreationDate()).isNotNull();
    }

    @Test
    void shouldSetCreationDateToCurrentDate() {
        //given
        DateTimeProvider dateTimeProviderMock = Mockito.mock(DateTimeProvider.class);
        ZonedDateTime now = ZonedDateTime.now();
        Mockito.when(dateTimeProviderMock.currentZonedTime()).thenReturn(now);
        UserCreationService userCreationService = new UserCreationService(dateTimeProviderMock);

        //when
        User user = userCreationService.createUser("Admin");

        //then
//        Assertions.assertThat(user.getCreationDate()).isEqualTo(ZonedDateTime.now());
        Assertions.assertThat(user.getCreationDate().isEqual(now));
    }

}
