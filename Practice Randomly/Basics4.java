import java.util.*;
public class Basics4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter radius of circle :");
        int R = scan.nextInt();

        double area = 3.14 *( R * R);
        System.out.println(" Area of circle is :" + area);

        double perimeter = 2 * 3.14 * R;
        System.out.println(" perimeter of circle is :" + perimeter);
        
    }
}
