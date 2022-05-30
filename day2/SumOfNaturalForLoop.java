package day2;

import java.util.Scanner;

public class SumOfNaturalForLoop {
    public static void main(String[] args)
    {
        System.out.println("Enter your natural number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i, sum = 0;
//executes until the condition returns true
        for(i = 1; i <= num; ++i)
        {
//adding the value of i into sum
            sum = sum + i;
        }
//prints the sum
        System.out.println("Sum of First 10 Natural Numbers is = " + sum);
    }
}

