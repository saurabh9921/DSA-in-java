import java.util.*;
public class SelectionSort {
   
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
         //Timecomplexity O(n^2)
        for(int r=0;r<arr.length-1;r++){
            int smallest=r;
            for(int k=r;k<arr.length;k++){
                if(arr[smallest]>arr[k]){
                    smallest=k;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[r];
            arr[r]=temp;
        }
        PrintSortedArrey(arr);
        sc.close(); 
    }
}


