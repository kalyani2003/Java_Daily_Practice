import java.util.*;
public class Basics15 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter any no :");
        int a = scan.nextInt();

        if(a >=10 && a <=99 ){
            System.out.println("its 2 digit no");

            int f = a/10;    // for checking both digits are same or not...
            int l = a%10;

            if(f == l){
                System.out.println("Both digits are same ");
            }
            else{
                System.out.println(" Both digitd are not same ");
            }
        }
        else{
            System.out.println("Its not 2 digit no ");
        }
    }
}
