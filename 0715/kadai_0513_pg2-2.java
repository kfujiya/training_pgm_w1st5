import java.util.*;

public class Main {
    
    //回文かどうか判定するメソッド
    private static boolean isPal(String s) {
        int head = 0;
        int tail = s.length() - 1;
        
        //左からの最初の文字と右からの最初の文字が一致しているかループで文字チェック
        while (head < tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }

        return true;
    }
    
    public static void main(String[] args) throws Exception {
        
        //入力
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int maxLength = 0;
        String longestPal = "";
        
        //入力文の中に回文の最長文字列を見つける為、ループで文字例チェック
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j <= input.length(); j++) {
                
                //入力文から文字列を引き出す
                String substring = input.substring(i, j);
                
                //文字列は回文かどうかメソッドで判定、かつ文字列は回文の最長文字列判定
                if (isPal(substring) && substring.length() > maxLength) {
                    maxLength = substring.length();
                    longestPal = substring;
                }
            }
        }
        
        //出力
        System.out.println(longestPal);
    }
}