import java.util.*;
public class Basics3 {
 public static void main(String[] args) {
    Scanner  scan = new Scanner(System.in);

    System.out.println(" Enter length and breadth of rectangle :");
    int length = scan.nextInt();
    int breadth = scan.nextInt();

    int area = length * breadth;
    System.out.println(" Area is :" + area);

    int perimeter = 2 * ( length + breadth);
    System.out.println(" perimeter is :" + perimeter);

 }   
}
