import java.util.*;
public class FuncOverloading2 {
    public static int sum(int a, int b){
        return a + b;
    }
    public static float sum (float a, float b){
        return a + b;     /// function overloading using --- data types
    }
    public static void main(String[] args) {
        System.out.println(sum(5,5));
        System.out.println(sum(3.2f,5.5f));   // f lgana compulsory hai !!
    }
}
