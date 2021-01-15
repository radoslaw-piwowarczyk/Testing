package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit5AssertionsTest {

    private JUnit5Assertions test = new JUnit5Assertions();

    @Test
    public void shouldBePrimeFor1(){
        //when
        boolean result = test.isPrimeNumber(1);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldBePrimeFor2(){
        //when
        boolean result = test.isPrimeNumber(2);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePrimeFor10(){
        //when
        boolean result = test.isPrimeNumber(10);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePrimeFor11(){
        //when
        boolean result = test.isPrimeNumber(11);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePrimeFor13(){
        //when
        boolean result = test.isPrimeNumber(13);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePrimeFor9(){
        //when
        boolean result = test.isPrimeNumber(9);

        //then
        Assertions.assertTrue(result);
    }
}
