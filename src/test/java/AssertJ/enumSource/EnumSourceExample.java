package AssertJ.enumSource;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class EnumSourceExample {
    @ParameterizedTest
    @EnumSource(SingUpStatus.class)
    void shouldNotHaveAccess(SingUpStatus singUpStatus) {
        //given
        AcessController acessController = new AcessController();

        //when
        boolean hasAccess = acessController.checkAccessForSignupStatus(singUpStatus);

        //then
        Assertions.assertThat(hasAccess).isFalse();
    }
}
