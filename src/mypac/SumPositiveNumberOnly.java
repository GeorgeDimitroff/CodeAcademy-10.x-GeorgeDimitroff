package mypac;

import java.util.Scanner;

public class SumPositiveNumberOnly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= number){
            sum += i;
            i++;
        }
        System.out.println("Sum of all positive numbers is: " + sum);
    }
}
