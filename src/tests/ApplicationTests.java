package tests;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTests {

    @Test
    public void inputThreeShouldReturnFizz() {
        assertEquals("Fizz", new FizzBuzz().testNumber(3));
    }

    @Test
    public void inputSixShouldReturnFizz() {
        assertEquals("Fizz", new FizzBuzz().testNumber(6));
    }

    @Test
    public void inputFiveShouldReturnBuzz() {
        assertEquals("Buzz", new FizzBuzz().testNumber(5));
    }

    @Test
    public void inputTenShouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().testNumber(10));
    }

    @Test
    public void inputTwoShouldReturnTwo(){
        assertEquals("2", new FizzBuzz().testNumber(2));
    }

    @Test
    public void inputNumberDivisibleByThreeAndFiveShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().testNumber(15));
    }

    @Test
    public void inputNumberContainsThreeShouldReturnFizz(){
        assertEquals("Fizz", new FizzBuzz().testNumber(83));
    }

    @Test
    public void inputNumberContainsFiveShouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().testNumber(52));
    }

    @Test
    public void inputNumberContainsFiveAndAreDivisibleByThreeShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().testNumber(156));
    }
}