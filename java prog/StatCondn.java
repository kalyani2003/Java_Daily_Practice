import java.util.*;
public class StatCondn {
    public static void main(String args[]){

    int age = 25;
    
    if(age >= 18){
        System.out.println("YOU CAN VOTE");
        System.out.println("YOU CAN DRIVE");
    }  
    else{
        System.out.println("YOU ARE NOT ELIGIBLE");
    }  
    if(age <= 15){
        System.out.println(" YOU ARE TEENAGER ");
    }
    else{
        System.out.println(" YOU ARE ADULT ");
    }
}
}
