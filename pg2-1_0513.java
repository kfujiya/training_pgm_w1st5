import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        //入力チェックをするライブラリ
        
        String N = sc.nextLine();
        Integer X = Integer.parseInt(N);
        //文字列数の決定
        
        for(int i = 0; i < X; i++){ //X回分の回文判定
            String sample = sc.nextLine();
            //サンプルの文字列
            
            String sample2 = sample.replaceAll(" ", "");
            //半角スペースを消す
            
            String resample = new StringBuilder(sample2).reverse().toString();
            //逆にした文字列
            
            String result = (sample2.equals(resample)) ? "Yes" : "No";
            //回文の判定
            System.out.println(result);
            
        }
    }
}
