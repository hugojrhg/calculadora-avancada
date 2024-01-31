package com.hugo.service;

import com.hugo.model.Operation;

import static com.hugo.utils.CalculatorUtils.*;

public class CalculatorService {

    public Double calculate(Double num1, Double num2, Operation operation){

        try{
        return switch (operation){
            case SUM -> sum(num1, num2);
            case SUBTRACT -> subtract(num1, num2);
            case MULTIPLY -> multiply(num1, num2);
            case DIVIDE -> divide(num1, num2);
        };
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
            return null;
        }

    }

}
