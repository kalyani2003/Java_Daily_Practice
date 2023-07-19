import java.util.*;
public class Basics13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any no :");
        int a = scan.nextInt();

        if (a>=999&& a<=9999){
            System.out.println("no is 4 digit :");
        }
        else{
            System.out.println("no is not 4 digit :");
        }
    }
}
