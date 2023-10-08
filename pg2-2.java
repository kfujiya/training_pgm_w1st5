import java.util.*;
//文字列が渡されるので、その中に含まれる回文で最長のものを出力してください
class Main
{
    // `low`と`high`の両方向に展開して、すべての回文を検索
    public static void expand(String str, int low, int high, Set<String> set)
    {
        //`str[low.high]`が回文でなくなるまで実行します
        //２文字以上の怪文が見つかるとSetに格納
        while (low >= 1 && high < str.length()
                && str.charAt(low) == str.charAt(high))
        {
            //すべての回文をセットにプッシュします
            set.add(str.substring(low, high + 1));
 
            //回文の中心から両方向に展開
            low--;
            high++;
        }
    }
 
    //入力した文字列からすべての一意のパリンドローム部分文字列を検索する関数
    public static void findPalindromicSubstrings(String str)
    {
        // 規範事例(入力された文字がない時)
        if (str == null) {
            return;
        }
 
        //すべての一意のパリンドロームサブストリングを格納するための空のセットを作成
        Set<String> set = new HashSet<>();
 
        for (int i = 0; i < str.length(); i++)
        {
            //`str[i]`を中点とするすべての奇数の長さの回文を検索(expandメソッドを使う)
            expand(str, i, i, set);
 
            //`str[i]`と`str[i+1]`を使用してすべての偶数の長さの回文を検索(expandメソッドを使う)
            expand(str, i, i + 1, set);
        }
 
        //すべての一意のパリンドローム部分文字列を出力します（発見した回文全て出力）
        //System.out.print(set);
        
        //最長の回文になっているだけ出力
        Optional<String> maxStr = set.stream().max( (s1, s2) -> s1.length() - s2.length() );
        System.out.println( maxStr.get() ); 
    }
 
    //メインメソッド
    public static void main(String[] args)
    {
       // 文字列の入力
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        //文字制限
        if(str.length() > 256){
             System.out.println("256文字以下にしてください。");
        }
        else{
        
        System.out.println("『" + str + "』" + "の中で一番長い回文は");
        
        //回文を検索するfindPalindromicSubstringsメソッドを使い最長の怪文を出力
        findPalindromicSubstrings(str);
        }
    }
}
