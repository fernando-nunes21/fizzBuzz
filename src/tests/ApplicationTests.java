package tests;

import junit.framework.TestCase;
import main.FizzBuzz;

public class ApplicationTests extends TestCase {

    public void testFizz() {
        assertEquals("Fizz", new FizzBuzz().testNumber(3));
    }

    public void testFizzNumberDividedByThree() {
        assertEquals("Fizz", new FizzBuzz().testNumber(6));
    }

    public void testBuzz() {
        assertEquals("Buzz", new FizzBuzz().testNumber(5));
    }

    public void testBuzzNumberDividedByFive(){
        assertEquals("Buzz", new FizzBuzz().testNumber(10));
    }

    public void testNumberNotFizzAndNotBuzz(){
        assertEquals("2", new FizzBuzz().testNumber(2));
    }

    public void testFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().testNumber(15));
    }

    public void testFizzNumberThreeInTheString(){
        assertEquals("Fizz", new FizzBuzz().testNumber(83));
    }
}