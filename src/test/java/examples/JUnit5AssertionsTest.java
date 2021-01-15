package examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnit5AssertionsTest {

    private JUnit5Assertions test = new JUnit5Assertions();

    @Test
    public void shouldBePrimeFor1() {
        //when
        boolean result = test.isPrimeNumber(1);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldBePrimeFor2() {
        //when
        boolean result = test.isPrimeNumber(2);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePrimeFor10() {
        //when
        boolean result = test.isPrimeNumber(10);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldBePrimeFor11() {
        //when
        boolean result = test.isPrimeNumber(11);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldBePrimeFor13() {
        //when
        boolean result = test.isPrimeNumber(13);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldNotBePrimeFor9() {
        //when
        boolean result = test.isPrimeNumber(9);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnValidCode() {
        //when
        JUnit5Assertions.Code code = test.getCode("a");

        //then
        Assertions.assertEquals("a", code.getKey());
        Assertions.assertNotNull(code.getCreatedAtTimestamp());
        Assertions.assertNotNull(code.getCode());
    }

    @Test
    public void shouldReturnSameObjects() {
        //when
        JUnit5Assertions.Code code = test.getCode("a");
        JUnit5Assertions.Code code2 = test.getCode("a");

        //then
        Assertions.assertSame(code, code2);
    }

    @Test
    public void shouldReturnDifferentObjects() {
        //when
        JUnit5Assertions.Code code = test.getCode("a");
        JUnit5Assertions.Code code2 = test.getCode("b");

        //then
        Assertions.assertNotSame(code, code2);
    }
}
