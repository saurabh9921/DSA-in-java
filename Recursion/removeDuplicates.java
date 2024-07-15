public class removeDuplicates {
    public static boolean[] map= new boolean[26];
    public static void remove(String str,int idx,String nwstr){

        if(idx==str.length()){
            
            System.out.println(nwstr);
            return;
        }
        char currentChar=str.charAt(idx);
        if(map[currentChar-'a']){
           
            remove(str,idx+1,nwstr);

        }else{
            nwstr+=currentChar;
            map[currentChar-'a']=true;
            remove(str, idx+1,nwstr);
        }

    }
    public static void main(String[] args) {
        String str="abbdf";
        remove(str,0,"");
        
    }

     
}