import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        //文字列入力回数
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        
        //Setデータを使用して、既に登場した文字列を保持
        Set<String> seenStrings = new HashSet<>();
        
        //Setに既に含まれているかどうか確認
        for (int i = 0; i < input; i++) {
        
            //文字列入力
            String wordEnt = sc.nextLine();
            
            //含まれている場合
            if (seenStrings.contains(wordEnt)) {
            
                //出力
                System.out.println("もう見た");
            
            //含まれていない場合
            } else {
            
                //登場してない文字列をSetデータに挿入
                seenStrings.add(wordEnt);
                
                //出力
                System.out.println("かわいい～");
                
            }
        }
    }
}