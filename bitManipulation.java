import java.util.*;

public class bitManipulation {
    public static void main(String[] args) {
        //set Bit
        int nm,pos,x; 
        String r;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.println("Enter number");
        nm=sc.nextInt();
        System.out.println("Enter position of bit");
        pos=sc.nextInt();
        System.out.println("1.Get Bit/n 2.Set Bit 3.");
        x=sc.nextInt();

        int bitmask=1<<pos;
        int notbitmask=~(bitmask);

        switch (x) {
            case 1:
            //Get Bit
                if((bitmask & nm)== 0){
                    System.out.println("bit was zero");
                }
                else{
                    System.out.println("bit was one");
                }
                break;
            case 2:
            //Set Bit
                int bit=bitmask | nm;//
                System.out.println(bit);
                break;
            
            case 3:
            //Clear Bit
                int nm1= nm & notbitmask;
                System.out.println(nm1);
                break;

             case 4:
            //Update Bit
                int ub=sc.nextInt();
                if(ub==0){
                    int nm2= nm & notbitmask;
                    System.out.println(nm2);
                }
                else{
                     bit=bitmask | nm;
                    System.out.println(bit);
                break;
                }
                break; 

            default: 
                System.out.println("Enter valid option");
                break;
        }

        r=sc.nextLine();
        System.out.println("do yo repeat press: Y/y");

        
    }while(r=="y"|| r=="Y");
        
        sc.close();
    }
}
