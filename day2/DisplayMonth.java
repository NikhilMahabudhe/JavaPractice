package day2;

import java.util.Scanner;

public class DisplayMonth {
    public static void main(String args[]){
        System.out.println("Enter month number:");
        Scanner scanner = new Scanner(System.in);
        int monthNo = scanner.nextInt();
        switch (monthNo){
            case 1:
                System.out.println("this month is januvary");
                break;
            case 2:
                System.out.println("this month is febvary");
                break;
            case 3:
                System.out.println("this month is march");
                break;
            case 4:
                System.out.println("this month is april");
                break;
            case 5:
                System.out.println("this month is may");
                break;
            case 6:
                System.out.println("this month is june");
                break;
            case 7:
                System.out.println("this month is july");
                break;
            case 8:
                System.out.println("this month is auguest");
                break;
            case 9:
                System.out.println("this month is september");
                break;
            case 10:
                System.out.println("this month is octomber");
                break;
            case 11:
                System.out.println("this month is november");
                break;
            case 12:
                System.out.println("this month is december");
                break;
            default:
                System.out.println("Enter correct number");
                break;
        }
    }
}
