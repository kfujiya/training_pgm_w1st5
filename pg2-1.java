import java.util.*;
//文字列がいくつか渡されるので、回文かどうか判断してください。
public class Main {
    
                //回文判定メソッド
                public static boolean isPalindrome(String Sk) {
                    
                StringBuilder sb = new StringBuilder(Sk);
                return Sk.equals(sb.reverse().toString());
                
                }
    
    public static void main(String[] args) throws Exception {
        //入力する
        Scanner scanner = new Scanner(System.in);
        
        //確認用
        //System.out.println("数字を入力してください");
        
        //最初↓で回数の数字を取っていたが、nextLine()を一緒に使うと面倒なのでStringに変換する方法をとる
        //Integer x = scanner.nextInt();
       
       try{
             //nextLineでStringを取ったあとIntegerに変換する
            String IntLine = scanner.nextLine();
            Integer x = Integer.parseInt(IntLine);
        
        
            //入力する数字は1〜30しか認めない
            if(x < 1 || x > 30){
                System.out.println("1〜30の数字を入力してください");
            }
        
            //1<=30の数字の時
            else{
                //最初に入力した数字を表示する
                System.out.println(x);
        
                //入力回数分判定する？
                for(int k = 0; k < x; k++){
            
                    String s = scanner.nextLine();
                
                    //空白がある場合、空白を除去した新しいStringを作成する必要がある
                    String Sk = s.replaceAll("　| ","");
                
                    //確認用
                    //System.out.print(Sk);
            
                    if(isPalindrome(Sk)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                
                }
            }
 
       }//一行目に数字以外が入力された時エラー文を出す
       catch(NumberFormatException e){
           System.out.println("1行目は1〜30の数字を入力してください");
       }
       //一行目で入力した判定回数が余分だった時エラー文を出す
       catch(NoSuchElementException e){
           System.out.println("これ以上判定する文字列がありません。");
       }
        

    }
}
