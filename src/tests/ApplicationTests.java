package tests;

import junit.framework.TestCase;
import main.FizzBuzz;

public class ApplicationTests extends TestCase {

    public void testFizz() {
        assertEquals("Fizz", new FizzBuzz().numberDividedByThree(3));
    }

    public void testFizzNumberDividedByThree() {
        assertEquals("Fizz", new FizzBuzz().numberDividedByThree(6));
    }

    public void testBuzz() {
        assertEquals("Buzz", new FizzBuzz().numberDividedByFive(5));
    }

    public void testBuzzNumberDividedByFive(){
        assertEquals("Buzz", new FizzBuzz().numberDividedByFive(10));
    }
}