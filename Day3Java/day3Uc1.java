package day3java;

public class day3Uc1 {
    public static void main(String args[]){
        int empPresent = 1;
        double empRandom =Math.floor(Math.random()*10)%2;
        if (empPresent==empRandom) {
            System.out.println("Employee is Present");
        }else{
                System.out.println("Employee is Absent");
            }
        }

    }

