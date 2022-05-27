package day1java;

import java.util.Scanner;

public class CompairString {
    public static void main(String args[]){
        System.out.println("Enter 1st string");
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        System.out.println("Enter 2nd string");
        String string2 = scanner.nextLine();
        if(string1.equals(string2)){
            System.out.println("String is Equal");
        }else {
            System.out.println("String is NotEqual");
        }

    }
}
