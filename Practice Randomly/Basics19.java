import java.util.*;
public class Basics19 {
    public static void main (String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter any 3 nos :");
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();

    if(a>b && a>c){
        System.out.println("a is greatest no ");
        }
        else if(a>b){
            System.out.println("b is greatest no");
        }
        else {
            System.out.println(" c is greatest ");
        }
    }
}