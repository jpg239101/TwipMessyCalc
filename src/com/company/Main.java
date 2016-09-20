package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kb = new Scanner(System.in);

        boolean nonBreakable = true;
        String num1;
        String num2;
        boolean yes = true;
        double val1 = 0;
        double val2 = 0;

        while(nonBreakable) {
            System.out.println("Please select an operation 'add' 'subtract' 'multiply' 'divide'");
            String operator = kb.next();

            System.out.println("Input your first number");
            num1 = kb.next();
            System.out.println("Input your second number");
            num2 = kb.next();

            if (num1.contains("0") || num1.contains("1") || num1.contains("2") || num1.contains("3") || num1.contains("4") || num1.contains("5") || num1.contains("6") || num1.contains("7") || num1.contains("8") || num1.contains("9")){
                val1 = Double.parseDouble(num1);
            }
            else {
                System.out.println("please use a real number for the first #");
                yes = false;
            }
            if (num2.contains("0") || num2.contains("1") || num2.contains("2") || num2.contains("3") || num2.contains("4") || num2.contains("5") || num2.contains("6") || num2.contains("7") || num2.contains("8") || num2.contains("9")) {
                val2 = Double.parseDouble(num2);
            }
            else{
                System.out.println("please use a real number for the second #");
                yes = false;
            }


            if (operator.equals("add") && yes){
                Double sum = val1 + val2;
                System.out.println(sum);
                break;
            }

            else if (operator.equals("subtract") && yes){
                double sum = val1 - val2;
                System.out.println(sum);
                break;
            }

            else  if (operator.equals("multiply") && yes){
                double sum = val1 * val2;
                System.out.println(sum);
                break;
            }

            else if (operator.equals("divide") && yes){
                double sum = val1 / val2;
                System.out.println(sum);
                break;
            }

            else if (yes){
                System.out.println("Please select from the list");
            }
            else{

            }
        }

    }
}
