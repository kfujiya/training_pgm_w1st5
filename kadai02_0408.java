


import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int m = 0;
        //�����鐔�Ƃ������鐔���i�[
        System.out.print("    1  2  3  4  5  6  7  8");
        System.out.println("  9");
        System.out.print("-----------------------------");
        System.out.println();
        for(int i = 1; i <= 9; i++){
            System.out.print(i + "|");
            for(int j = 1; j <= 9; j++){
				    
			
                
                System.out.print(" "); //�ǂ���
                //�|���Z���s��
                
                if (10 > i * j) 
				    System.out.print( " " );
                System.out.print(i * j); //i�̒i�̌v�Z
            }
        System.out.println();
        
        }
    }
}


