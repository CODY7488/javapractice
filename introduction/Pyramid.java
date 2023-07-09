package introduction;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){

     Scanner sc=new Scanner(System.in);

     System.out.println("enter rows"); 
     int a=sc.nextInt();

     System.out.println("enter columns");
     int b=sc.nextInt();

     for(int i=1; i<= a; i++ ){
        for(int j=1; j<= b; j++){
            System.out.print(" *");
        }
        System.out.println();
     }
    }
    
}
