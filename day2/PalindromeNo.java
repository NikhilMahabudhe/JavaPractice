package day2;

import java.util.Scanner;

public class PalindromeNo {
    public static void main(String args[]){
        System.out.println("enter Yours number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse=0;
        for (;number!=0;) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number=number/10;
        }
        System.out.println(reverse);
        if (reverse==number){
            System.out.println("this is palindrome number");
        }else{
            System.out.println("this is not palindrome number");
        }
    }
}
