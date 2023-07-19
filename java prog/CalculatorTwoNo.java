import java.util.*;
public class CalculatorTwoNo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

         System.out.println("Enter value of a");
        int a = scan.nextInt();

        System.out.println("Enter value of b :");
        int b = scan.nextInt();
        
        System.out.println("Enter the operator :");
        char  operator = scan.next().charAt(0);
        

       
        switch(operator){
            case '+' : System.out.println(a+b);   // dont use "" bcz cannot conver the string to char 
                       break;
            case '-' : System.out.println(a-b);
                       break;
            case '*' : System.out.println(a*b);
                       break;
            case '/' : System.out.println(a/b);
                       break;
            case '%' : System.out.println(a%b);
                       break;
            default :  System.out.println("Invalid input");
        }

    }
}
