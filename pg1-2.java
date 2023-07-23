import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int a = 0;
        int b = 0;
        int n = 0;
        int i = 0;
        
        System.out.print("  ");
        
             for(i=1;i < 10;i++){
                System.out.print("  "+i);
             }
                System.out.println();
                System.out.println("-----------------------------");
         
         for(a=1;a < 10;a++){
                   n++;
                   System.out.print(n + "|");
            
                    for(b=1;b < 10;b++){
                        
                        if(a*b < 10){
                        System.out.print("  "+a*b);
                        
                        }
                            if(a*b >= 10){
                              System.out.print(" "+a*b);
                            }
                   }
           System.out.println();
        }
    }
}