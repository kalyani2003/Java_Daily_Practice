import java.util.*;
public class increment {
    public static void main(String[] args) {
        
         int a = 10;
         int b = ++a; // firstly increases the value of a("Change the value fistly then use")... then save to variable b
         int c = a++; // firstly value is as it is("value use then change the value)....! then value increases nd saved to b
         System.out.println(b);
         System.out.println(c);
         System.out.println(a);
    }
}
