import java.util.*;
public class Basics20 {
    public static void main(String args[], Object index){
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter color code :");
        char a = scan.next().charAt();
        char b = scan.next().charAt();
        char c = scan.next().charAt();
        char d = scan.next().charAt();

        if(a =='r'|| a == 'R'){
            System.out.println("Red color");
        }
        else if (b =='g' || b == 'G'){
            System.out.println("Green color ");
        }
        else if (c == 'b'|| c == 'B'){
            System.out.println("Blue color");
        }
        else{
            System.out.println("White color");
        }
        
    }
}
