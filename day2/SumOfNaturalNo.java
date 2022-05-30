package day2;

import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String args[]){
        System.out.println("please enter natural number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i=1, sum=0;
        while (i<=number){
            sum = sum +i;
            i++;
            System.out.println(sum);

        }



    }
}
