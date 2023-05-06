import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        System.out.print(" " + "|");
        //列数（一番上の行（表外））を出力する処理
        for(int i = 1; i < 10; i++){
            System.out.printf("%3d", i);
        }
        System.out.println();
        //横棒を出力する処理
        for(int i = 1; i < 30; i++){
            System.out.print("-");
        }
        System.out.println();
        //表の1行目以降を出力する処理
        for(int i = 1; i < 10; i++){
            //行数とその右の縦棒を出力する処理
            System.out.print(i + "|");
            //表の値を出力する処理
            for(int j = 1; j < 10; j++){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
