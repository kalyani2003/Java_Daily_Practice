import java.util.*;
public class Basics16 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any no :");
        int a = scan.nextInt();

        if (a >=0){
            System.out.println(" It is positive no ");
            if (a%2==0){
                System.out.println("It is even no");
            }
            else{
                System.out.println(" It is odd no ");
            }
        }
        else{
            System.out.println( "no is negative");
        }
    }
}
