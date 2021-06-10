package main;

public class FizzBuzz implements FizzBuzzInterface {


    public String testNumber(Integer number){
        String resultFinal="";
        resultFinal = numberDividedByThree(number);
        resultFinal += numberDividedByFive(number);

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
            return "";
        }
    }

    private String numberDividedByFive(Integer number){
        if(number %5 == 0 || number.toString().contains("5")){
            return "Buzz";
        }
        else{
            return "";
        }
    }


}
