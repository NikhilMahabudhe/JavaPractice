package day6;

import java.util.Scanner;

public class Fibonaci {
public static void main(String args[]){
    System.out.println("Enter Yours Number:");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int sum =0;
    for (int i=0;i<=number;i++){
        sum =sum +i;
        System.out.println(sum);
    }
}

}

