package day6;

import java.util.Scanner;

public class PrimeNumber {
        public static void main(String args[]){
            int i,m=0,status=0;
            System.out.println("Enter Yours Number:");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            m=number/2;
            if(number==0||number==1){
                System.out.println(number+" is not prime number");
            }else{
                for(i=2;i<=m;i++){
                    if(number%i==0){
                        System.out.println(number+" is not prime number");
                        status=1;
                        break;
                    }
                }
                if(status==0)  { System.out.println(number+" is prime number"); }
            }
        }
    }