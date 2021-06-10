package main;

public class FizzBuzz implements FizzBuzzInterface {

    public String numberDividedByThree(Integer number){
        if(number %3 == 0){
            return "Fizz";
        }
        else{
            return null;
        }
    }

    public String numberDividedByFive(Integer number){
        if(number %5 == 0){
            return "Buzz";
        }
        else{
            return null;
        }
    }
}
