package Sorting;
import java.util.Scanner;

public class InsertionSort {
   public static void PrintSortedArrey(int[] arr){
        for(int r=0;r<arr.length;r++){
            System.out.print(arr[r]+" ");
        }
    }
    public static void main(String[] args) {
        //input array
        int[] arr;
        Scanner sc=new Scanner(System.in);
        System.out.println("input length of Array");
        int ln=sc.nextInt();
        
        arr= new int[ln];
        System.out.println("input array of length"+ln);
        for(int i=0;i<ln;i++){
            arr[i]=sc.nextInt();
       
        }
       
        //Sort array
        //time complexity=O(n^2)
        for(int r=1;r<arr.length;r++){
          int current=arr[r];
          int k=r-1;
          while (k>=0 && current<arr[k]) {
           arr[k+1]=arr[k];
           k--; 
          }

          //place
          arr[k+1]=current;
        }
        PrintSortedArrey(arr);
        sc.close();
    } 
}
   