import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg2-2
        // 標準入力を取得
        Scanner sc = new Scanner(System.in);
        // 文字列の個数
        String str = sc.nextLine();
        
        // 最大文字数
        int maxLength = 0;
        // 最大文字数の回文
        String maxStr = "";
        
        for (int i=0; i<str.length(); i++) {
            for (int j=i+2; j<str.length(); j++) {
                // 文字列を切り出し
                String str2 = str.substring(i, j);
                
                // 切り出した文字列が回文かチェック
                if (kaibunCheck(str2)) {
                    // 現時点の最大文字数より多いかチェック
                    if (maxLength < str2.length()) {
                        // 最大文字数及び最大文字数の回文を更新
                        maxLength = str2.length();
                        maxStr = str2;
                    }
                }
            }
        }
        // 最大文字数の回文を出力
        System.out.println(maxStr);
    }
    
    /**
    * 入力された文字列が回文かチェックする
    * @param str 文字列
    * @return 回文であるかの結果
    */
    public static boolean kaibunCheck(String str) {
        // 反転した文字列を作成
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        
        // 反転した文字列と一致するかチェック
        if (str.equals(sb.toString())) {
            return true;
        } else {
            return false;
        }
    }
}
