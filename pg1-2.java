import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 九九表
        int a = 0;
        int b = 0;
        int n = 0;
        int i = 0;
        
        //項目部分：横軸
        System.out.print("  ");
        
             for(i=1;i < 10;i++){
                System.out.print("  "+i);
             }
                System.out.println();
                System.out.println("-----------------------------");
         
         //項目名：縦軸と九九表
         for(a=1;a < 10;a++){
                    //項目名：縦軸
                   n++;
                   System.out.print(n + "|");
                    
                    //九九表
                    for(b=1;b < 10;b++){
                        
                        if(a*b < 10){
                        System.out.print("  "+a*b);
                        
                        }
                            //乗算結果が２桁の時は空白の数を減らして表のずれを起こさないようにする
                            if(a*b >= 10){
                              System.out.print(" "+a*b);
                            }
                   }
            //n*9まで一列出力できたら改行する
           System.out.println();
        }
    }
}