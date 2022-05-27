package day1java;

import java.util.Scanner;

public class PracticeBySirVowel {
    public static void main(String args[]){
        System.out.println("Enter the alphabate");
        Scanner scanner = new Scanner(System.in);
        String alphabate = scanner.nextLine();
        if(alphabate=="A"||alphabate=="E"||alphabate=="I"||alphabate=="O"||alphabate=="U"){
            System.out.println(alphabate+"=Alphabate is vowel");
        }else{
            System.out.println(alphabate+"=Alphabate is consonant");
        }
    }
}
