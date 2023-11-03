import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg1-3
        int MIN_NUM = 1; //最小値
        int MAX_NUM = 100; //最大値
        int HOGE_NUM = 3; // 指定数値
        
        // 最小値と最大値が正しく設定されていない場合値を入れ替える
        if (MIN_NUM>MAX_NUM) {
            int temp = MIN_NUM;
            MIN_NUM = MAX_NUM;
            MAX_NUM = temp;
        }
        
        for (int i=MIN_NUM; i<=MAX_NUM; i++) {
            // 指定した数値の倍数またはどこかの桁に指定した数値がある数の場合は代わりに“hoge”を出力
            if ((HOGE_NUM!=0 && i!=0 && (i%HOGE_NUM)==0) || Integer.toString(i).contains(Integer.toString(HOGE_NUM))) {
                System.out.println("hoge");
            } else {
                System.out.println(i);
            }
        }
    }
}
