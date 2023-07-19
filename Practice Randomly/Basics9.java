import java.util.*;
public class Basics9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any 2 nos :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        int c = a%10+b%10;  /// use short tricks
        System.out.println("Sum of last digit is :"+c);
    }
}
