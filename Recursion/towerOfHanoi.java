
//time comp=O(2^n)
public class towerOfHanoi {
    public static void transferDisk(int n,String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }

        transferDisk(n-1,src,dest,helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        transferDisk(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
       int n=2;
       transferDisk(n,"S","H","D");
    }
    
}
