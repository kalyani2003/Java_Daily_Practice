import java.util.*;
public class CalculatorThreeNo {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a :");
        int a = scan.nextInt();

        System.out.println("Enter b :");
        int b = scan.nextInt();

        System.out.println("Enter c :");
        int c = scan.nextInt();
        
        System.out.println("Enter operator :");
        char operator = scan.next().charAt(0);

        switch(operator){
            case '+' : System.out.println(a+b+c);
                        break;
            case '-' : System.out.println(a-b-c);
                        break;
            case '*' : System.out.println(a*b*c);
                        break;
            case '/' : System.out.println(a/b/c);
                        break;
            case '%' : System.out.println(a%b%c);
                        break;
            default :  System.out.println("INVALID INPUT");

                    }

    }
}
