import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg1-2
        int ROW_NUM = 9;  //かけられる回数
        int COL_NUM = 9;  //かける回数
        
        if (ROW_NUM>0 && COL_NUM>0) {
            int digits = String.valueOf(ROW_NUM*COL_NUM).length(); //最大桁数
    
            // ヘッダー出力
            System.out.print(String.format("%"+digits+"s", "") + "|");
            
            for (int i=1; i<=COL_NUM; i++) {
                System.out.print(String.format("%"+digits+"d", i));
                    if (i<COL_NUM) {
                        System.out.print(" ");
                    } else {
                        System.out.print("\r\n");
                    }
            }
            
            // 罫線出力
            System.out.println(String.join("", Collections.nCopies(digits+digits*COL_NUM+COL_NUM, "-")));
            
            // 結果出力
            for (int i=1; i<=ROW_NUM; i++) {
                System.out.print(String.format("%"+digits+"d", i) + "|");
                for (int j=1; j<=COL_NUM ; j++) {
                    System.out.print(String.format("%"+digits+"d", i*j));
                    if (j<COL_NUM) {
                        System.out.print(" ");
                    } else {
                        System.out.print("\r\n");
                    }
                }
            }
        }
    }
}
