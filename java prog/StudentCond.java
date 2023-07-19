import java.util.*;
public class StudentCond {
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter marks :");
    int marks = scan.nextInt();
     
    if(marks >= 33){
        System.out.println("PASS");
    }
     else {
        System.out.println("FAIL");
    }
    
}
}
