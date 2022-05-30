package day2;

import java.util.Scanner;

public class MinMax {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of a:");
        int a = scanner.nextInt();
        System.out.println("Please enter value of b:");
        int b = scanner.nextInt();
        System.out.println("Please enter value of c:");
        int c = scanner.nextInt();
        int d = a+b*c;
        int e = c+a/b;
        int f = a%b+c;
        int g = a*b+c;
        System.out.println(" value of d :"+d);
        System.out.println(" value of e:"+e);
        System.out.println(" value of f:"+f);
        System.out.println(" value of g:"+g);
        int h = Math.max(d,e);
        int i= Math.max(h,f);
        int j= Math.max(d,e);
        int k= Math.max(j,g);
        System.out.println("the maximum number is:"+k);
        int l = Math.min(d,e);
        int m= Math.min(l,f);
        int n= Math.min(m,e);
        int o= Math.min(n,g);
        System.out.println("the minimum number is:"+o);

    }
}