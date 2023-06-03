import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String longest = findlongest(line);
        if (!longest.isEmpty()) {
            System.out.println(longest);
        } else {
            System.out.println("回文が見つかりませんでした。");
        }
    }
    
    // 部分文字列を生成して回文かどうかを判定して更新していくメソッド
    public static String findlongest(String line) {
        
        String longest = "";
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 1; j <= line.length(); j++) {
                String substring = line.substring(i, j);
                if (isCheck(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }
    
    //回文かどうかを調べるメソッド
    public static boolean isCheck(String line) {
        // 1文字の場合は回文とみなさない
        if (line.length() == 1) {
            return false;
        }
        int left = 0;
        int right = line.length() - 1;
        
        while (left < right) {
            if (line.charAt(left++) != line.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
