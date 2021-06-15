package main;

public class FizzBuzz implements FizzBuzzInterface {


    public String testNumber(Integer number){
        String resultFinal="";
        resultFinal = numberDivisibleByThree(number);
        resultFinal += numberDivisibledByFive(number);

        if(resultFinal.equals("")){
            return number.toString();
        }
        else{
            return resultFinal;
        }
    }

    private String numberDivisibleByThree(Integer number){
        if(number %3 == 0 || number.toString().contains("3")){
            return "Fizz";
        }
        else{
            return "";
        }
    }

    private String numberDivisibledByFive(Integer number){
        if(number %5 == 0 || number.toString().contains("5")){
            return "Buzz";
        }
        else{
            return "";
        }
    }


}
