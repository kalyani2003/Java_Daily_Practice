import java.util.*;
public class PrimeRangeNos {
    public static boolean isPrime(int n){  // boolean is compulsory to mention data type..
        for(int i =2; i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeRange(int n){
        for (int i =2; i<= n; i++){
            if(isPrime(i)){
                System.out.println(i );
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        primeRange(100);
    }
}
