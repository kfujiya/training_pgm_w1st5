import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    int maxLength = 0;
    String maxLengthStr = "";

    Scanner scanner = new Scanner(System.in);
    System.out.println("文字列を入力してください");
    String str = scanner.nextLine();
    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 2; j < str.length(); j++) {

        // 入力文字列から判定対象文字列を抽出
        String jmentStr = str.substring(i, j);

        // 回文を判定かつ判定した回文が最長文字列か判定
        if (isPalindrome(jmentStr) && jmentStr.length() > maxLength) {
          maxLength = jmentStr.length();
          maxLengthStr = jmentStr;
        }
      }
    }
    System.out.println(maxLengthStr);
  }

  // 回文判定メソッド
  public static boolean isPalindrome(String sentence) {
    sentence = sentence.replaceAll(" ", "");
    StringBuilder sb = new StringBuilder(sentence);
    return sentence.equals(sb.reverse().toString());
  }
}