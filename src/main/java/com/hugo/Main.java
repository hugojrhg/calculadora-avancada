package com.hugo;

import com.hugo.model.Calculator;
import com.hugo.model.Operation;
import com.hugo.model.User;
import com.hugo.service.CalculatorService;

import static com.hugo.utils.MenuUtils.*;

public class Main {
    public static void main(String[] args) {

        CalculatorService calculatorService = new CalculatorService();

        printSingUpMessage();
        User user = getUserToSave();
        Calculator calculator = new Calculator(user);

        printWelcomeMessage(user);
        Double num1 = getNumber("Digite um número: ");
        Double num2 = getNumber("Digite outro número: ");
        Operation operation = getOperation();

        System.out.println("\nO resultado é: " + calculatorService.calculate(num1, num2, operation));
    }
}