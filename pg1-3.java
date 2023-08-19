import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        int i = 0;
        
             for(i=1;i <= 100;i++){
                 
                  String si = String.valueOf(i);
                 
                 if(i % 3 == 0 || si.contains("3")){
                   System.out.println("hoge");
                    
                }
                
                else{
                    System.out.println(i);
                }

            }
    }
}