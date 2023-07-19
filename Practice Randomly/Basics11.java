import java.util.*;
public class Basics11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 angles values :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a+b+c == 180){
            System.out.println(" Triangle is formed :");
        }
        else{
            System.out.println("Triangle is not formed :");
        }
    }
}
