import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("数値を入力してください");
    String countStr = scanner.nextLine();
    int count;
    try {
      count = Integer.parseInt(countStr);
      System.out.println("入力値：" + count);
      int num = 0;
      while (num < count) {
        String str = scanner.nextLine();
        System.out.println(str);
        if (isPalindrome(str)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
        num++;
      }
    } catch (NumberFormatException e) {
      System.out.println("数値でない値が入力されています");
    }
  }
  public static boolean isPalindrome(String sentence) {
    sentence = sentence.replaceAll(" ", "");
    StringBuilder sb = new StringBuilder(sentence);
    return sentence.equals(sb.reverse().toString());
  }
}