import java.util.*;
public class Basics12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any no :");
        int a= scan.nextInt();

        if(a>=10 && a<=99){
            System.out.println("It is a 2 digit no :");
        }
        else{
            System.out.println("It is not 2 digit no :");
        }
    }
}
