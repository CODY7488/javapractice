package introduction;
import java.util.Scanner;

public class LoopNew {

    public static void main(String[] args){

   // int i=0;
   // do {
//   System.out.println(i);
   //     i=i+1;
   // } while(i<11);
   Scanner sc=new Scanner(System.in);
   

   int sum=0;
   int n=sc.nextInt();
   for(int i=0; i<=n; i++){
    sum=sum+i;
   }

   System.out.println(sum);
}
}
