package day2;

import java.util.Scanner;

public class SingleDigitNumber {
    public static void main (String args[]){
      System.out.println("Please enter single digit number");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        switch (digit){
            case 0:
                System.out.println("the digit is zero");
                break;
            case 1:
                System.out.println("the digit is one");
                break;
            case 2:
                System.out.println("the digit is two");
                break;
            case 3:
                System.out.println("the digit is three");
                break;
            case 4:
                System.out.println("the digit is four");
                break;
            case 5:
                System.out.println("the digit is five");
                break;
            case 6:
                System.out.println("the digit is six");
                break;
            case 7:
                System.out.println("the digit is seven");
                break;
            case 8:
                System.out.println("the digit is eight");
                break;
            case 9:
                System.out.println("the digit is nine");
                break;

        }
    }
}
