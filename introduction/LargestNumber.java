package introduction;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("type your first number");
        int firstNumber=sc.nextInt();

System.out.println("type your second number");
int secondNumber=sc.nextInt();

System.out.println("type your third number");
int thirdNumber=sc.nextInt();

if(firstNumber>secondNumber && firstNumber>thirdNumber){
System.out.println(firstNumber+" is greater");
}
else if (secondNumber>firstNumber && secondNumber>thirdNumber){
   
    System.out.println(secondNumber+" is greater");

}
else {
    System.out.println(thirdNumber+" is greater");
}
    }
    
}
