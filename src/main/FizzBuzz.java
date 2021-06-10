package main;

public class FizzBuzz implements FizzBuzzInterface {


    public String testNumber(Integer number){
        String resultDividedByThree;
        String resultDividedByFive;
        String resultFinal="";
        resultDividedByThree = numberDividedByThree(number);
        resultDividedByFive = numberDividedByFive(number);
        if(resultDividedByThree != null){
            resultFinal = resultDividedByThree;
        }
        if(resultDividedByFive != null){
            resultFinal = resultFinal + resultDividedByFive;
        }
        if(resultFinal.equals("")){
            return number.toString();
        }
        else{
            return resultFinal;
        }
    }

    private String numberDividedByThree(Integer number){
        if(number %3 == 0 || number.toString().contains("3")){
            return "Fizz";
        }
        else{
            return null;
        }
    }

    private String numberDividedByFive(Integer number){
        if(number %5 == 0){
            return "Buzz";
        }
        else{
            return null;
        }
    }


}
