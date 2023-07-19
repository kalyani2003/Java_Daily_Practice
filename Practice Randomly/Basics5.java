import java.util.*;
public class Basics5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Enter radius :");
        int r = scan.nextInt();

        double Volume = 4/3.0 * 3.14 *( r * r * r);
        System.out.println(" volume of Sphere is :" + Volume);

    }
}
