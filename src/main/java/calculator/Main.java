package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.print("Input the operation (variants: +, -, *, /): ");
        char operation = in.next().charAt(0);

        System.out.println(calc.returnResultOfOperation(a, b, operation));
    }
}

