package introduction;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in );

        System.out.println("ENTER YOUR NUMBER");
        int number=sc.nextInt();

        if(number%2==0){
            System.out.println(number+" IS EVEN");

        }
        else{
            System.out.println(number+" IS ODD");
        }
    }
    
}
