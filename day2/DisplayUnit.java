package day2;

import java.util.Scanner;

public class DisplayUnit {
    public static void main (String args[]) {
        System.out.println("Please enter digit number in multiple 10 or 100 of hundred only");
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();
        switch (digit) {
            case 1:
                System.out.println("the digit is one");
                break;
            case 10:
                System.out.println("the digit is ten");
                break;
            case 100:
                System.out.println("the digit is hundred");
                break;
            case 1000:
                System.out.println("the digit is one thousand");
                break;
            case 10000:
                System.out.println("the digit is ten thousand");
                break;
            case 100000:
                System.out.println("the digit is one lakh");
                break;
            case 1000000:
                System.out.println("the digit is ten lakh");
                break;
            case 10000000:
                System.out.println("the digit is one core");
                break;
            case 100000000:
                System.out.println("the digit is ten core");
                break;
            case 1000000000:
                System.out.println("the digit is hundred core");
                break;

        }
    }
}
