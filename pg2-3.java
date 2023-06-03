import java.util.*;

public class Main {
    private String previous;
    
    public static void main(String[] args) {
        Main stringChecker = new Main();
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        //nextIntの改行文字を読まないための処理
        sc.nextLine();
        String line;
        for (int i = 0; i < X; i++) {
            line = sc.nextLine();
            if (stringChecker.isSameAsPrevious(line)) {
                System.out.println("もう見た");
            } else {
                System.out.println("かわいい～");
            }
        }
    }
    
    public Main() {
        previous = null;
    }
    
    //同じ文字列か判定するメソッド
    public boolean isSameAsPrevious(String str) {
        if (previous == null) {
            previous = str;
            return false;
        }
        boolean isSame = previous.equals(str);
        previous = str;
        return isSame;
    }
    

}
