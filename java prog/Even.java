import java.util.*;
public class Even{
public static void main(String[] args) {

    Scanner scan =new Scanner(System.in);
    int num = scan.nextInt();

    if ( num%2 == 0)   // REMEMBER NOT USING THE / OPERATOR USE PROPER OP AS %
{
System.out.println(" EVEN NO");
}
    else{
System.out.println("ODD NO");
}
}
}