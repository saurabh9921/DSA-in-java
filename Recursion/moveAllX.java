public class moveAllX {
    public static void  moveX(String str,int idx,int count){
        if(idx==str.length()-1){
            System.out.println();
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveX(str,idx+1,count);

        }
    }
    public static void main(String[] args) {
        String str="abxxdxux";
        int count=0;
        moveX(str, 0,count);
        
    }
    
}
