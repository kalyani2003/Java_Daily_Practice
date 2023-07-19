import java.util.*;
public class Basics10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any no :");
        int a =scan.nextInt();

        if(a%2==0){
            System.out.println("No is even :");
        }
        else{
            System.out.println("No is odd");
        }
    }
}
