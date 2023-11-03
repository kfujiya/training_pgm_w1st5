import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg1-1
        int MIN_NUM = 1; // 最小値
        int MAX_NUM = 9; // 最大値
        
        // 最小値と最大値が正しく設定されていない場合値を入れ替える
        if (MIN_NUM>MAX_NUM) {
            int temp = MIN_NUM;
            MIN_NUM = MAX_NUM;
            MAX_NUM = temp;
        }
        
        // 最小値から最大値までを改行しながら順番に出力
        for (int i=MIN_NUM; i<=MAX_NUM; i++) {
            System.out.println(i);
        }
    }
}
