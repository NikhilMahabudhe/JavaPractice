package day6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String args[]) {
        System.out.println("Enter Yours Number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=1,sum=0;

        while (i<=number/2) {
            if (number % i == 0) {
                sum = sum+i;
            }
            i++;
        }
        if (sum==number){
            System.out.println("this is perfect number");
        }else{
            System.out.println("this is not perfect number");

        }
    }
}
