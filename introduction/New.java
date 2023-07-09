package introduction;
import java.util.Scanner;

public class New {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("a");
        int a=sc.nextInt();

        System.out.println("b");
        int b=sc.nextInt();

        if(a==b){
            System.out.println("a equals to b");
        }
        else if(a<b){
            System.out.println("a is smaller");
        }
        else{
        System.out.println("a is greater");
        }
    }
    
}
