package Mockito.Random;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PasswordResetMailContentProviderTest {

    @Test
    void shouldPreparePasswordResetEmail(){
        //given
        RandomProvider randomProvider = Mockito.mock(RandomProvider.class);
        Mockito.when(randomProvider.generateRandomKey()).thenReturn("asdfghjkl1234567890");
        PasswordResetMailContentProvider passwordResetMailContentProvider = new PasswordResetMailContentProvider(randomProvider);

        //when
        String resetMailContent = passwordResetMailContentProvider.createResetMailContent();

        //then
        Assertions.assertThat(resetMailContent).isEqualTo("Cześć, aby przejść do resetowania hasła <a href=\"https://example.com/reset?key=asdfghjkl1234567890\">ten link</a>");
    }
}
