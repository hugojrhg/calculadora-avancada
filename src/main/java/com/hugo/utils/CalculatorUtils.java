package com.hugo.utils;

public class CalculatorUtils {

    public static Double sum(Double num1, Double num2){
        return num1+num2;
    }

    public static Double subtract(Double num1, Double num2){
        return num1-num2;
    }

    public static Double multiply(Double num1, Double num2){
        return num1*num2;
    }

    public static Double divide(Double num1, Double num2){
        if(num2.equals(0.0)){
            System.out.println("Impossível dividir por 0. ;-;");
            return null;
        }
        return num1/num2;
    }

}
