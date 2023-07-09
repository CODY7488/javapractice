package array;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF STUDENT");
        int a=sc.nextInt();

        int marks[] = new int[a];
        System.out.println("enter THE MARKS NOW");

        for(int i=0; i<a; i++){
            marks[i] = sc.nextInt();


        }
        int averageMarks=0;
        for(int i=0; i<a; i++){
            averageMarks += marks[i];

        }
        averageMarks /= a;
        System.out.println("AVERAGE MARKS = "+ averageMarks);

    }
    
}
