package tests;

import main.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTests {

    @Test
    public void inputNumberThreeShouldReturnFizz() {
        assertEquals("Fizz", new FizzBuzz().returnFizzBuzz(3));
    }

    @Test
    public void inputNumberSixShouldReturnFizz() {
        assertEquals("Fizz", new FizzBuzz().returnFizzBuzz(6));
    }

    @Test
    public void inputNumberFiveShouldReturnBuzz() {
        assertEquals("Buzz", new FizzBuzz().returnFizzBuzz(5));
    }

    @Test
    public void inputNumberTenShouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().returnFizzBuzz(10));
    }

    @Test
    public void inputNumberTwoShouldReturnTwo(){
        assertEquals("2", new FizzBuzz().returnFizzBuzz(2));
    }

    @Test
    public void inputNumberFifteenShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().returnFizzBuzz(15));
    }

    @Test
    public void inputNumberContainsThreeShouldReturnFizz(){
        assertEquals("Fizz", new FizzBuzz().returnFizzBuzz(83));
    }

    @Test
    public void inputNumberContainsFiveShouldReturnBuzz(){
        assertEquals("Buzz", new FizzBuzz().returnFizzBuzz(52));
    }

    @Test
    public void inputNumberContainsFiveAndAreDivisibleByThreeShouldReturnFizzBuzz(){
        assertEquals("FizzBuzz", new FizzBuzz().returnFizzBuzz(156));
    }


}