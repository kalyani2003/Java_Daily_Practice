import java.util.*;
public class Decrement {
    public static void main(String[] args) {
        
        int a = 50;
        int b = --a;   // value change then value use
        System.out.println(b);
        System.out.println(a); 

        int c = a--;     // value use then value change
        System.out.println(a); 
        System.out.println(c);


    }
}