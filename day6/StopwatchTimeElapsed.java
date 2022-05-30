package day6;

public class StopwatchTimeElapsed {
    public static void main(String args[]){
        long start = System.nanoTime();
        for (int i=0;i<=1000;i++){
            System.out.println(i);
        }
        long end = System.nanoTime();
        System.out.println("Took " + (end - start));
    }
}
