import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // pg2-3
        // 標準入力を取得
        Scanner sc = new Scanner(System.in);
        // 文字列の個数
        int X = Integer.parseInt(sc.nextLine());
        // 既出文字列リスト
        List<String> alreadyStrList = new ArrayList<String>();
        
        for (int k=0; k<X; k++) {
            // 文字列を取得
            String S = sc.nextLine();
            
            // 既出文字列リストに文字列が含まれているかチェック
            if (!alreadyStrList.contains(S)) {
                // 初めて登場した文字列の場合
                System.out.println("かわいい～");
                // 既出文字列リストに追加
                alreadyStrList.add(S);
            } else {
                // 過去渡された物と同じ文字列の場合
                System.out.println("もう見た");
            }
        }
    }
}
