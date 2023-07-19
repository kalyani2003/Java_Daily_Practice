import java.util.*;
public class PrimeNoFunc {
    public static boolean isPrime(int n){  // boolean is compulsory to mention data type..
        for(int i =2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       System.out.println(isPrime(13)); 
    }
}
// optimizw way of prime no ques solving....