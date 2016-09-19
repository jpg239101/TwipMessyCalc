package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);

        boolean nonBreakable = true;
        String num1;
        String num2;

        while(nonBreakable) {
            System.out.println("Please select an operation 'add' 'subtract' 'multiply' 'divide'");
            String operator = kb.next();

            System.out.println("Input your first number");
            num1 = kb.next();
            System.out.println("Input your second number");
            num2 = kb.next();

            double val1 = Double.parseDouble(num1);
            double val2 = Double.parseDouble(num2);


            if (operator.equals("add")){
                Double sum = val1 + val2;
                System.out.println(sum);
                break;
            }

            else if (operator.equals("subtract")){
                double sum = val1 - val2;
                System.out.println(sum);
                break;
            }

            else  if (operator.equals("multiply")){
                double sum = val1 * val2;
                System.out.println(sum);
            }

            else if (operator.equals("divide")){
                double sum = val1 / val2;
                System.out.println(sum);
            }

            else{
                System.out.println("Please select from the list");
            }
        }

    }
}
