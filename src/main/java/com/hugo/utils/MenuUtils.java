package com.hugo.utils;

import com.hugo.model.Operation;
import com.hugo.model.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuUtils {

    static Scanner scan = new Scanner(System.in);

    public static void printSingUpMessage(){
        System.out.println("Bem vindo a minha calculadora, antes de iniciar o uso identifique-se: ");
    }

    public static void printWelcomeMessage(User user){
        System.out.println("\nOlá " + user.getName() + " você já está pronto para usar sua calculadora");
    }

    public static Double getNumber(String message) {
        System.out.println(message);

        try {
            return scan.nextDouble();
        }catch (InputMismatchException ex){
            System.out.println("Entrada Inválida");
            scan.nextLine();
            return getNumber(message);
        }
    }

    public static Operation getOperation() {
        System.out.println("Escolha a operação que deseja realizar: ");
        System.out.println("");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        switch (scan.nextInt()) {
            case 1: {
                return Operation.SUM;
            }
            case 2: {
                return Operation.SUBTRACT;
            }
            case 3: {
                return Operation.MULTIPLY;
            }
            case 4: {
                return Operation.DIVIDE;
            }
            default: {
                System.out.println("Opção Inválida");
                getOperation();
                return null;
            }
        }
    }

    public static User getUserToSave(){
        User user = new User();

        System.out.print("Nome : ");
        user.setName(scan.nextLine());
        System.out.print("Idade: ");
        user.setAge(Integer.parseInt(scan.nextLine()));
        System.out.print("Emprego: ");
        user.setJob(scan.nextLine());

        return user;
    }

}
