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
            
            
            //サンプルの文字列を2文字抽出
            //逆文字列を2文字抽出
            
            //比較して違ったら戻って、2文字目+1文字抽出して判定
            String result = (sample2.equals(resample)) ? "Yes" : "No";
            //回文の判定
            System.out.println(result);
            //同じだったらもう一文字ずつ追加
            //違ったら格納して戻る(1回目)
            
            //2回目以降は格納した文字数と比較
            //新規の方の文字数が大きければそれを格納
            //それ以外は格納せずそのまま戻る
            
            
        }
    
    
    }
}
