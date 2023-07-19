import java.util.*;
public class Basics6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Enter temperature in Farheneit :");
        float Fahreneit = scan.nextFloat();

        Double Celcius = 5/9.0 * (Fahreneit - 32);
        System.out.println("Conver value into degree Celcius :" + Celcius);
        

    }
}
