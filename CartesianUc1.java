package Day3Java;
public class CartesianUc1 {
  public static void main(String args[]){
      int x1 = 10;
      int x2 = 15;
      int y1 = 20;
      int y2 = 25;
      int a=x2-x1;
      double r1 = Math.pow(a,2);
      int b = y2-y1;
      double r2 =Math.pow(b,2);
      double length = Math.sqrt(r1+r2);
      System.out.println("length of Line:"+length);
  }
}
