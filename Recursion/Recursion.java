


public class Recursion{
    //for x^n in stack height=log n

    public static int square(int x,int n){
        if(n==0 && x>0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            
        return square(x,n/2)*square(x,n/2);
        }
        else{
            return square(x,n/2)*square(x,n/2)*x;
        }
        
    }
    public static void main(String[] args) {
        int x=5,n=2;
        
           int ans= square(x,n);
           System.out.println(ans);
    }

    // x^n

    // public static void square(int x,int n,int sq){
    //     if(n<=0){
    //         System.out.println(sq);
    //         return;
    //     }
    //     sq*=x;
    //     square(x,n-1,sq);
    // }
    // public static void main(String[] args) {
    //     int x=2,n=5,sq=x;
    //     if(n==0 && x>0){
    //         System.out.println("1"); 
    //     }
    //     else
    //         square(x,n-1,sq);
    // }

    //fabonacii sequence

    // public static void fabo(int a,int b, int n){
    //     if(n==0){
    //         return;
    //     }
    //     int c=a+b;
    //     System.out.println(c);
    //     fabo(b,c,n-1);

    // }
    // public static void main(String[] args) {
    //     int a=0,b=1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n =9;
    //     fabo(a,b,n-2);

    // }

    //sum of first n numbers

    // public static void sum(int n,int sm){
    //     if(n==0){
    //         System.out.println(sm);
    //         return;
    //     }
    //     sm+=n;
    //     sum(n-1,sm);

    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     int sm=0;
    //     sum(n,sm);

    // }

    //factorial of a number

    // public static void fact(int n,int fac){
    //     if(n==0){
    //         System.out.println(fac);
    //         return ;
    //     }
       
    //     fac*=n;
    //     fact(n-1,fac);
        
       
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     int fac=1;
    //     fact(n,fac);
       
    // }
}