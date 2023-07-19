import java.io.*;
import java.util.*;

public class vol {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

     System.out.println("Enter radis of circle:");
        int r;
        float v;

        r=scan.nextInt();
        v=scan.nextFloat();
        v= (float) ((4/3)*3.14*(r*r*r));

        System.out.println("Radius of cicle is:"+v);


    }

    
}
