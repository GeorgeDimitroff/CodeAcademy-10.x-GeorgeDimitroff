package mypac;

import java.util.Scanner;

public class PrintTriangleTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size or triangle: ");
        int size = scan.nextInt();

        for(int i = 0; i <= size-1; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= size-1-i; k++){
                System.out.print( "#" + " ");
            }
            System.out.println();
        }
    }
}
