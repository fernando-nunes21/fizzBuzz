package tests;

import junit.framework.TestCase;
import main.FizzBuzz;

public class ApplicationTests extends TestCase {

    public void testFizz(){
        assertEquals("Fizz", new FizzBuzz().numberDividedByThree(3));
    }

    public void testFizzDividedByThree(){
        assertEquals("Fizz", new FizzBuzz().numberDividedByThree(6));
    }
}
