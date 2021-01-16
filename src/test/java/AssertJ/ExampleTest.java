package AssertJ;

import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    public void nameShouldEndWithLetterA (){
        String name = "Dorota";

        //written this way to see the difference between AssertJ and JUnit5
        org.junit.jupiter.api.Assertions.assertFalse(name.endsWith("a"));
        org.assertj.core.api.Assertions.assertThat(name).doesNotEndWith("a");

    }
}
