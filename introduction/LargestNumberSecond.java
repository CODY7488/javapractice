package introduction;
import java.util.Scanner;

public class LargestNumberSecond {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("ENTER YOUR FIRST NUMBER");
int firstNumber=sc.nextInt();

System.out.println("ENTER YOUR SECOND NUMBER");
int secondNumber=sc.nextInt();

System.out.println("ENTER YOUR THIRD NUMBER");
int thirdNumber=sc.nextInt();

if(firstNumber>secondNumber && firstNumber>secondNumber){
    System.out.println(firstNumber+" IS GREATER");
}
    else if (secondNumber>firstNumber && secondNumber>thirdNumber){
        System.out.println(secondNumber+" IS GREATER");
    }
    else{
        System.out.println(thirdNumber+" IS GREATER");
    }
}

}
    

