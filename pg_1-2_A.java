import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        int i, j, k, l;
        
        //最初の桁
        System.out.print(" " + "|");
        
        //罫線
        for ( k = 1; k <= 9; k++){
            
            System.out.printf("%3d", k);
        }
        
        System.out.print("\n");
        
        for ( l = 1; l <= 29; l++){
            
            System.out.print("-");
        }
        
        System.out.print("\n");
        
        //メインロープ
        for ( i = 1; i <= 9; i++){
            
            System.out.print(i + "|");
            
            for ( j = 1; j < 10; j++){
                
                
                System.out.printf("%3d", i * j);
            }
            
            System.out.print("\n");
        }
    }
}
