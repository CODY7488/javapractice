package array;

import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DIMENSION");
        
        int dim =sc.nextInt();
        


        
        int a[][]=new int[dim][dim];
        int b[][]=new int[dim][dim];
        System.out.println("ENTER FIRST MATRIX");
        for(int i=0; i<dim; i++){
            for(int j=0; j<dim; j++){
                System.out.println(a[i][j]);
            }
        }
        System.out.println("ENTER YOUR SECOND MATRIX");
        for(int i=0; i<dim; i++){
            for(int j=0; j<dim; j++){
                System.out.println(b[i][j]);
            }
        }
        


        System.out.println("ENTER SECOND MATRIX");
        int b[][]= sc.nextInt();




        sc.close();
    }

    
}
