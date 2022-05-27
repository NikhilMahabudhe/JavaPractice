package day1java;

import java.util.Scanner;

public class SumOfCommandLineArguments {
  static void sum(int a, int b){
          System.out.println("The sum of numbers"+a+b);
      }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int x =scanner.nextInt();
        int y =scanner.nextInt();
        sum(x,y);

    }
}
