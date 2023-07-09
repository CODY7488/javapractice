package introduction;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("enter your rows");
        int a=sc.nextInt();

        System.out.print("enter your column");
        int b=sc.nextInt();

        for(int i=1; i<=a; i++){
            for(int j=1; j<=b; j++){

                if( i==a || j==b ||i==1 ||j==1) 
                System.out.print(" *");
            else {
                System.out.print("  ");
            }
        }
            System.out.println();
        }

    }
    }
