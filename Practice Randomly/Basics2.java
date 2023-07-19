import java.util.*;
public class Basics2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 5 subjects marks");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        int sum = a + b + c + d + e;
        System.out.println(" total marks of subject is :" +sum);

    }
}
