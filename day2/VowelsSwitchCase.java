package day2;

import java.util.Scanner;

public class VowelsSwitchCase {
    public static void main(String args[]){
        System.out.println("please enter alphabte only lower case :");
        Scanner scanner = new Scanner(System.in);
        String alphabate = scanner.nextLine();
        switch (alphabate){
            case "a":
                System.out.println("this is vowel");
                break;
            case "e":
                System.out.println("this is vowel");
                break;
            case "i":
                System.out.println("this is vowel");
                break;
            case "o":
                System.out.println("this is vowel");
                break;
            case "u":
                System.out.println("this is vowel");
                break;
            default:
                System.out.println("this is consonanat");
                break;

        }
    }
}
