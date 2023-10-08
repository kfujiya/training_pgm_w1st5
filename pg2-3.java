import java.util.*;
//文字列が渡されるのでもう登場したか判断してください
public class Main {
    public static void main(String[] args) throws Exception {
         //入力用
        Scanner sc = new Scanner(System.in);
        //格納するList
        List<String> zoo = new ArrayList<String>();
       
       try{ 
             //nextLineでStringを取ったあとIntegerに変換する
            String IntLine = sc.nextLine();
            Integer x = Integer.parseInt(IntLine);
        
        
            //入力する数字は1〜1000しか認めない
            if(x < 1 || x > 1000){
                System.out.println("1〜1000の数字を入力してください");
            }
        
            //1〜1000の数字の時
            else{
                //最初に入力した数字を表示する
                System.out.println(x);
        
                //入力回数分判定する
                for(int k = 0; k < x; k++){
                    //動物の名前を読み取る
                    String Sk = sc.nextLine();
                    
                    //確認用
                    //System.out.println(animal);
                    
                    if(zoo.contains(Sk) != true) {
                        //リストに名前がない場合かわいい〜と言いながらaddでリストにいれる。
                        System.out.println("かわいい〜");
                        zoo.add(Sk);
                        
                    } else if(zoo.contains(Sk) == true){
                        //リストに名前があったらもう見たとがっかりしながらスルーする
                        System.out.println("もう見た");
                    }
                
                }
            }
 
       }//一行目に数字以外が入力された時エラー文を出す
       catch(NumberFormatException e){
           System.out.println("1行目は1〜1000の数字を入力してください");
       }
       //一行目で入力した判定回数が余分だった時エラー文を出す
       catch(NoSuchElementException e){
           System.out.println("あなたは入力した回数以上動物を見ることはできません。");
       }
    }
}
