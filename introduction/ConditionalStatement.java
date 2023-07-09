package introduction;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("TYPE FIRST NO.: ");
        int firstNumber=sc.nextInt();

System.out.println("TYPE SECOND NO.: ");
        int secondNumber=sc.nextInt();

if(firstNumber>secondNumber){
    System.out.println(firstNumber+" is greater");
}
else{
    System.out.println(secondNumber+" is greater");
}
    }
}
