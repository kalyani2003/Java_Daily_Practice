import java.io.*;
import java.util.*;

 public class Circle{
   public static void main(String args[])
{
try (Scanner scan = new Scanner(System.in)) {
   System.out.println(" Enter radius of a circle");
   
      float r = scan.nextFloat();
      double Area = 3.14 * r * r;
       
      System.out.println("Area of circle is" +Area);
}
}
}
