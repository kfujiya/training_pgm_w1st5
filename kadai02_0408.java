


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int m = 0;
        //かける数とかけられる数を格納
        System.out.print("    1  2  3  4  5  6  7  8");
        System.out.println("  9");
        System.out.print("-----------------------------");
        System.out.println();
        for(int i = 1; i <= 9; i++){
            System.out.print(i + "|");
            for(int j = 1; j <= 9; j++){
				    
			
                
                System.out.print(" "); //壁つくる
                //掛け算を行う
                
                if (10 > i * j) 
				    System.out.print( " " );
                System.out.print(i * j); //iの段の計算
            }
        System.out.println();
        
        }
    }
}


