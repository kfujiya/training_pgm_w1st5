import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        //nextIntの改行文字を読まないための処理
        sc.nextLine();
        String line;
        for (int i = 0; i < X; i++) {
            line = sc.nextLine();
            //半角スペースをトリムする処理
            line = line.replaceAll(" ","");
            if(isCheck(line)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
       }
    }
    //回文かどうかを調べるメソッド
	public static boolean isCheck(String line) {
        int min = 0;
        int max = line.length() - 1;
        while(min < max) {
            if(line.charAt(min++) != line.charAt(max--)) {
                return false;
            }
        }
        return true;
    }
}
