public class subsequences {
    //time complexity=O(2^n)
    public static void subseq(String str,int idx,String nwstr){

        if(idx==str.length()){
            
            System.out.println(nwstr);
            return;
        }
        char currChar=str.charAt(idx);

        //to be
        subseq(str, idx+1, nwstr+currChar);

        //or not to be
        subseq(str, idx+1, nwstr);
       

    }
    public static void main(String[] args) {
        String str="abcd";
        subseq(str,0,"");
        
    }

     
}
    

