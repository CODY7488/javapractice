package introduction;
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the number");
        int button =sc.nextInt();

        switch(button){
            case 1:System.out.println("hello");
            break;
            case 2:System.out.println("namastey");
            break;
            case 3:System.out.println("bojour");
            break;
            default:System.out.println("default button");
        }
    }
    
}
