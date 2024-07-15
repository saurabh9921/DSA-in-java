import java.util.HashSet;
public class uniqueSubsequence {
   
        public static void unicseq(String str,int idx,String nwstr,java.util.HashSet<String> set){

            if(idx==str.length()){
                if(set.contains(nwstr)){
                    return;
                }
                else{

                    System.out.println(nwstr);
                    set.add(nwstr);
                    return;
                }
            }
            char currChar=str.charAt(idx);
    
            //to be
            unicseq(str, idx+1, nwstr+currChar,set);
    
            //or not to be
            unicseq(str, idx+1, nwstr,set);
           
    
        }
        public static void main(String[] args) {
            String str="aaa";
            HashSet<String> set=new HashSet<>();
            unicseq(str,0,"",set);
            
        }   
    }
    

