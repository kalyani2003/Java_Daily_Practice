import java.util.*;
public class AssignmentOp {
    public static void main(String[] args) {
        
     // Assignment operators are .... =  +=  -=  *=  /=  %=
     // A = A+10  is similar as ......(A+=10)
     // A = A-10 is similar as....... (A-=10)
        int a = 10;
        //a = a+20;   = 30
        a = a+=20; //same result
           System.out.println(a);

        int b = 20;
        //b= b-5;  = 15
        b = b-=5; // sAME result
           System.out.println(b);

        int c = 50;
       // c = c * 10;  = 5000
        c = c*=10;
           System.out.println(c);

        int d = 100;
       // d = d/10;   =10
        d = d/=10;
           System.out.println(d);

        int e = 20;
        // e = e % 2;  =0
        e = e%=2;
           System.out.println(e);


    }
}
