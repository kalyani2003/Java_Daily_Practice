import java.util.*;
public class Basics7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any 3 nos :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        float mean = (a+b+c)/3.0f;   // take of operator precedence () so we used..
        System.out.println("mean is :"+ mean);
    }
}