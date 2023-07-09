package introduction;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //     Nitesh nt=new Nitesh();
    //    System.out.println(nt.sum(24, 26));
    //    System.out.println(nt.substract(24, 26));
       // int arr[]={7,8,6,4,2};//static array

        System.out.println("kate nuber chau");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0; i<arr1.length; i++){
            System.out.println("enter your " +(i+1)+" number");
            arr1[i]=sc.nextInt();
        }
        System.out.println();

        // Arrays.sort(arr);
        // String str[]={"mohit","raja","golu"};
        // System.out.println(str.length);//arr.length is used to get the size of array
        // int sum=arr[2]+arr[3];
        // System.out.println(arr[0]);
        // System.out.println(sum);
       
        int sum1=0;
        for(int i=0; i<arr1.length; i++  ){
            System.out.println(arr1[i]);
            sum1=sum1+arr1[i];
        }
        System.out.println("tohar tota ");
        System.out.println(sum1);
        

    }
}

