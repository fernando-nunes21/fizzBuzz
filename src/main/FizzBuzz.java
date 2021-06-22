package main;

public class FizzBuzz{

    public String returnFizzBuzz(Integer inputValue){
        String resultFinal;
        resultFinal = getFizzByInputNumber(inputValue);
        resultFinal += getBUzzByInputNumber(inputValue);

        if(resultFinal.equals("")){
            return inputValue.toString();
        }
        else{
            return resultFinal;
        }
    }

    private String getFizzByInputNumber(Integer input){
        if(input %3 == 0 || input.toString().contains("3")){
            return "Fizz";
        }
        else{
            return "";
        }
    }

    private String getBUzzByInputNumber(Integer input){
        if(input %5 == 0 || input.toString().contains("5")){
            return "Buzz";
        }
        else{
            return "";
        }
    }


}
