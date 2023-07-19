import java.util.*;
public class IncomeTaxInput{
    public static void main(String args[]){

        try (Scanner scan = new Scanner(System.in)) {
            int income = scan.nextInt();
        int tax;

        if(income < 500000){
            tax = 0;
        }
        else if(income >= 500000 && income <= 1000000){
            tax = (int) (income * 0.2);
        }
        else{
            tax = (int) (income * 0.3);
        }
        System.out.println("YOUR TAX IS :"+tax);
        }
        
    }
}

