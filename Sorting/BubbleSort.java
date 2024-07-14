package Sorting;
import java.util.Scanner;
public class BubbleSort {
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
        for(int r=0;r<arr.length-1;r++){
            for(int k=0;k<arr.length-r-1;k++){
                if(arr[k]>arr[k+1]){
                    //swap
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        PrintSortedArrey(arr);
        sc.close();
    } 
}
