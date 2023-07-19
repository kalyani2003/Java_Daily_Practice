import java.io.*;
import java.util.*;

public class twoLastdigit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two nos:");
        int a,b,z;
        a=scan.nextInt();
        b=scan.nextInt();

      int x=a%10;
      int y=b%10;
      z=x+y;
      System.out.println("sum of Last digit is:"+z);
    }
}
