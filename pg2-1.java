import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg2-1
        // 標準入力を取得
        Scanner sc = new Scanner(System.in);
        // 文字列の個数
        int X = Integer.parseInt(sc.nextLine());
        
        for (int k=0; k<X; k++) {
            // 文字列を取得し、半角スペースを削除
            String str = sc.nextLine().replaceAll(" ", "");
            
            // 反転した文字列を作成
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.reverse();
            
            // 元の文字列と反転した文字列が一致するかチェック
            if (str.equals(sb.toString())) {
                // 文字列委が一致した場合
                System.out.println("Yes");
            } else {
                // 文字列委が一致しなかった場合
                System.out.println("No");
            }
        }
    }
}
