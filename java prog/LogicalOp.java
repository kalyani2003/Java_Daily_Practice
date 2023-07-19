import java.util.*;
public class LogicalOp{
    public static void main(String args[]){

// LOGICAL OPERATORS ARE ...... &&(AND)  ||(OR) !(NOT)

    System.out.println(5>3 && 10<5);   // TRUE && TRUE = TRUE otherwise FALSE
    System.out.println(5>3 && 10>5);

    System.out.println( 10>20 || 20>30);  // FALSE || FALSE = FALSE otherwise TRUE
    System.out.println( 10>20 || 20<30);

    System.out.println(10<20 != 20>30);         //  VICEVERSA (TRUE FALSE)
}
}