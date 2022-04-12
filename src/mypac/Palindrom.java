package mypac;

import java.util.Scanner;

public class Palindrom {
    public static boolean isPalindrome(String word){
        int stringLength = word.length() - 1;
        int i = 0;

        while(i < stringLength){
            if(word.charAt(i) != word.charAt(stringLength))
                return false;
            i++;
            stringLength--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter word to check: ");
        String word = scan.nextLine();

        if(isPalindrome(word))
            System.out.println("Word is palindrom!");
        else
            System.out.println("Word is Not palindrom!");

    }
}
