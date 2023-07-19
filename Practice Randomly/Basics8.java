import java.util.*;

import javax.xml.transform.Source;
public class Basics8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter any no :");
        int a = scan.nextInt();

        int Lastdigit = a%10;
        System.out.println("Last digit of no is :"+ Lastdigit); 

    }
}
