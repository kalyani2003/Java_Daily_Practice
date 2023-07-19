import java.util.*;
public class Basics14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any no :");
        int a = scan.nextInt();

        if(a >=100 && a <= 999){
            System.out.println("no os 3 digit :");

            int d= a%10;      // get last digit
            int b = a/10%10;   // get remaining no and its last digit
            int c = a/100;     // getting first digit 
            int sum = d+b+c;  ////sum of all 3 digits....
            System.out.println("Sum of digits is :"+sum);
        }
        else{
            System.out.println("It is not 3 digit no");
        }

    }
}
