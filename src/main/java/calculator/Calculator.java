package calculator;

public class Calculator {

    public int calculateTheSumOfNumbers(int a, int b) {
        return a + b;
    }

    public int calculateTheDifferenceOfNumbers(int a, int b) {
        return a - b;
    }

    public int calculateTheMultiplicationOfNumbers(int a, int b) {
        return a * b;
    }

    public int calculateTheDivisionOfNumbers(int a, int b) {
        if (b == 0) {
            System.out.println("Input the number > 0, please!");
        }
        return a / b;
    }

    public int returnResultOfOperation(int a, int b, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = calculateTheSumOfNumbers(a, b);
                break;
            case '-':
                result = calculateTheDifferenceOfNumbers(a, b);
                break;
            case '*':
                result = calculateTheMultiplicationOfNumbers(a, b);
                break;
            case '/':
                result = calculateTheDivisionOfNumbers(a, b);
                break;
            default:
                System.out.println("Choose the correct operation, please!");
        }
        return result;
    }

}
