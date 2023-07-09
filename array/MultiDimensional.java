package array;

import java.util.Scanner;

public interface MultiDimensional {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DIMENSION");

        int rows=sc.nextInt();
        int columns=sc.nextInt();

        
        int a[][]= new int[rows][columns];
        int b[][]= new int[rows][columns];
        System.out.println("ENTER YOUR FIRST MATRIX");
        for(int i=0; i<rows; i++){
                System.out.println("enter row "+(i+1));
            for(int j=0; j<columns; j++){
                sc.useDelimiter("[\\s,]+");
            a[i][j]=sc.nextInt();}
            
        }
        System.out.println("ENTER YOUR SECOND MATRIX");
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns; j++){
            b[i][j]=sc.nextInt();}
        }
        int c[][]=new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                c[i][j]= a[i][j]+b[i][j];
            }
        }
        System.out.println("RESULT MATRIX C IS");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.print(c[i][j] +" ");}
         System.out.println();

    }
   
    }
}
