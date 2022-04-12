package mypac;

import java.util.Scanner;

public class FactorialOfPositiveNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int factorial = 1;
        int i = 1;

        while(i <= number){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
