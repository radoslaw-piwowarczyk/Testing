package JUnit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAdd1To1AndReturn2(){
        //given
        int a = 1;
        int b = 1;
        Caclulator caclulator = new Caclulator();

        //when
        int result = caclulator.add(a,b);

        //then
        Assertions.assertEquals(2,result);
    }
    //checking how failing test works
    @Test
    void shouldAdd2To2AndReturn5(){
        //given
        int a=2;
        int b=2;
        Caclulator caclulator = new Caclulator();

        //when
        int result = caclulator.add(a,b);

        //then
        Assertions.assertEquals(5,result);
//        Assertions.assertTrue(result==5);
    }
}
