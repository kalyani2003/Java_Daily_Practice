import java.io.*;
import java.util.*;

public class lastDigit {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter any no:");
        int a,b;
        a=scan.nextInt();
    
         b=a%10;
         System.out.println("Last digit of no is:"+b);


    }
    
}
