import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        int i;
        
        for (i = 1; i <= 100; i++){
            
            String word = Integer.toString(i);
            
            if ( i % 3 == 0){
            
                System.out.println("hoge");
                
                continue;
            }
            
            if ( word.contains("3")){
             
                System.out.println("hoge");
                
                continue;
            }
            
            System.out.println(word);
            
        }
    }
}