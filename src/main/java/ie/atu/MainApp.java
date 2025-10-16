package ie.atu;

import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number: ");
        int firstNum = scan.nextInt();
        System.out.println("Please enter your second number: ");
        int secondNum = scan.nextInt();

        //Addition of two numbers
        Calculator calc = new Calculator();
        int result = calc.add(firstNum, secondNum);
        System.out.println("The Addition is: " + result);

        //Subtraction of two numbers
        int resultSub = calc.sub(firstNum, secondNum);
        System.out.println("The Subtraction is: " + resultSub);

        //Multiplication of two numbers
        int resultMul = calc.mul(firstNum, secondNum);
        System.out.println("the Multiplication is: " + resultMul);

        //division of two numbers
        if(secondNum == 0)
        {
            System.out.println("Can not Divide by zero.");
        }else
        {
            float resultDiv = calc.div(firstNum, secondNum);
            System.out.println("The Division is: " + resultDiv);
        }

        //remainder from division of two numbers
        int restRemainder = calc.remain(firstNum, secondNum);
        System.out.println("The Remainder of " + firstNum + " devided by " + secondNum + " is: " + restRemainder);

        //Power of a base to an exponent
        System.out.println("Please enter Base and Exponent: ");
        int base = scan.nextInt();
        int exponent = scan.nextInt();
        int resultPow = calc.pow(base, exponent);
        System.out.println(base + " to the power of " + exponent + " is: " + resultPow);

    }
}
