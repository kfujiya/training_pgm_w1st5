import java.util.*;
public class Main {
    //1〜100を数える間に間に3の倍数と3のつく数字でhogeを出力する
    public static void main(String[] args) throws Exception {
       
        int i = 0;
        
        for(i=1;i <= 100;i++){
            //"3"を検知するためにStringに変換する
            String si = String.valueOf(i);
            //3の倍数と3のつく数字の時hogeを出力
            if(i % 3 == 0 || si.contains("3")){
                System.out.println("hoge");
            }
            //それ以外はそのまま出力する
            else{
                System.out.println(i);
            }

        }
    }
}