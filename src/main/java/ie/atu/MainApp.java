package ie.atu;

import java.util.Locale;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your first number or your base: ");
        int firstNum = scan.nextInt();
        System.out.println("Please enter your second number or your exponent: ");
        int secondNum = scan.nextInt();
        System.out.println("Choose the Operation:");
        System.out.println("1. Addition \t 2. Subtraction \t 3. Multiplication \t 4. Division \t 5. Power of \t 6. Modulo \t 7. Exit");
        int choice = scan.nextInt();

        switch (choice)
        {
            case 1 ->
            {
                Calculator calc = new Calculator();
                double result = calc.add(firstNum, secondNum);
                System.out.println("The Result is: " + result);
            }
            case 2 ->
            {
                Calculator calc = new Calculator();
                double result = calc.sub(firstNum, secondNum);
                System.out.println("The Result is: " + result);
            }
            case 3 ->
            {
                Calculator calc = new Calculator();
                double result = calc.mul(firstNum, secondNum);
                System.out.println("The Result is: " + result);
            }
            case 4 ->
            {
                Calculator calc = new Calculator();
                if(secondNum == 0)
                {
                    System.out.println("Can not Divide by zero.");
                }else
                {
                    double result = calc.div(firstNum, secondNum);
                    System.out.println("The Result is: " + result);
                }
            }
            //Power of a base to an exponent
            case 5 ->
            {
                Calculator calc = new Calculator();
                double result = calc.pow(firstNum, secondNum);
                System.out.println(firstNum + " to the power of " + secondNum + " is: " + result);
            }
            //remainder from division of two numbers
            case 6 ->
            {
                Calculator calc = new Calculator();
                double result = calc.remain(firstNum, secondNum);
                System.out.println("The Remainder of " + firstNum + " devided by " + secondNum + " is: " + result);
            }
            case 7 ->
            {
                System.out.println("You have exited.");
                System.exit(0);
            }
            default ->
            {
                System.out.println("Invalid choice.");
            }
        }

    }
}
