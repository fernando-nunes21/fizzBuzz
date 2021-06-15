package tests;

import junit.framework.TestCase;
import main.FizzBuzz;

public class ApplicationTests extends TestCase {

    public void inputThreeShouldReturnFizz() {
        assertEquals("Fizz", new FizzBuzz().testNumber(3));
    }

    public void inputSixShouldReturnFizz() {
        assertEquals("Fizz", new FizzBuzz().testNumber(6));
    }

    public void inputFiveShouldReturnBuzz() {
        assertEquals("Buzz", new FizzBuzz().testNumber(5));
    }

    public void inputTenShouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().testNumber(10));
    }

    public void inputTwoShouldReturnTwo(){
        assertEquals("2", new FizzBuzz().testNumber(2));
    }

    public void inputNumberDivisibleByThreeAndFiveShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().testNumber(15));
    }

    public void inputNumberContainsThreeShouldReturnFizz(){
        assertEquals("Fizz", new FizzBuzz().testNumber(83));
    }

    public void inputNumberContainsFiveShouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().testNumber(52));
    }

    public void inputNumberContainsFiveAndAreDivisibleByThreeShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().testNumber(156));
    }
}