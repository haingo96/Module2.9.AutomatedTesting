package exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz_3() {
        int number = 3;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "Fizz";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_5() {
        int number = 5;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "Buzz";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_12() {
        int number = 12;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "Fizz";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_25() {
        int number = 25;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "Buzz";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_15() {
        int number = 15;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "FizzBuzz";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_7() {
        int number = 7;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "seven";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_16() {
        int number = 16;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "sixteen";

        assertEquals(expected, actual);
    }

    @Test
    void checkFizzBuzz_58() {
        int number = 58;

        String actual = FizzBuzz.checkFizzBuzz(number);
        String expected = "fifty eight";

        assertEquals(expected, actual);
    }

}