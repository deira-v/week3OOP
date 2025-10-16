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
        calc.add(firstNum, secondNum);
        int result = calc.add(firstNum, secondNum);
        System.out.println("The Addition is: " + result);

        //Subtraction of two numbers
        calc.sub(firstNum, secondNum);
        int resultSub = calc.sub(firstNum, secondNum);
        System.out.println("The Subtraction is: " + resultSub);

        //Multiplication of two numbers
        calc.mul(firstNum, secondNum);
        int resultMul = calc.mul(firstNum, secondNum);
        System.out.println("the Multiplication is: " + resultMul);

        //division of two numbers
        if(secondNum == 0)
        {
            System.out.println("Can not Divide by zero.");
        }else {
            calc.div(firstNum, secondNum);
            float resultDiv = calc.div(firstNum, secondNum);
            System.out.println("The Division is: " + resultDiv);
        }

    }
}
