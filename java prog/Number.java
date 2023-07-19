import java.io.*;
import java.util.*;
class Number{

public static void main(String args[])
{
  Scanner scan= new Scanner (System.in);

 System.out.println(" Enter a no which u want to make a  table");

int n,T;
n= scan.nextInt();
T= scan.nextInt();

for(int i=1; i<=10; i++)
{
T=n*i;
}
System.out.println(T);
}
}