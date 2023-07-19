import java.io.*;
import java.util.*;

public class meanNo {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("enter three nos:");
        int a,b,c;
        double z;
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();

        z=(a+b+c)/3.0;
        System.out.println("Mean is:"+z);
        

    }
    
}
