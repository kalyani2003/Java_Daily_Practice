import java.util.*;
public class IncomeTaxCondn {
    public static void main(String args[]){

        int income = 15000;

        if(income < 5000){
            System.out.println("YOU NEED TO PAY 0% TAX");
        }
        else if(income >=5000 && income <=10000 ){
            System.out.println("YOU NEED TO PAY 20% TAX");
        }
        else{
            System.out.println("YOU NEED TO PAY 30% TAX");
        }
        }
    }
    

