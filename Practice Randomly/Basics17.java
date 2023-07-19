import java.util.*;
public class Basics17 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any 3 angles :");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a+b+c == 180){
            System.out.println("Triangle is formed");
            if(a ==b || b==c || c==a){
                System.out.println("Triangle is Isocales");
            }
                if(a == b && b ==c){
                    System.out.println("Triangle is Equilateral");
                }
                    if(a ==90 || b==90 || c ==90){
                        System.out.println("Triangle is right angled ");
                    }
        }
         else{
            System.out.println("Triangle is not formed ");
         }
    }
}
