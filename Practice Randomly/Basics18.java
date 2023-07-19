import java.util.*;
public class Basics18 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any no :");
        int a = scan.nextInt();

        if (a>0){
            System.out.println("IT is positive no ");
        }
        else if(a<0){
            System.out.println("It is negative no");
        }
        else {
            System.out.println(" Its 0 ");
        }
    }
}
