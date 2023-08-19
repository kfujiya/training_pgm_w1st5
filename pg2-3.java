import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);
    System.out.println("数値を入力してください");
    String countStr = scanner.nextLine();

    try {
      int count = Integer.parseInt(countStr);
      List<String> list = new ArrayList<String>();

      for (int i = 0; i < count; i++) {
        String inputStr = scanner.nextLine();

        // 最初の入力文字列もしくはリストに存在しない文字列の場合
        if (i == 0 || !list.contains(inputStr)) {
          System.out.println("かわいい～");
        } else {
          System.out.println("もう見た");
        }
        // 入力した文字列をリストに追加
        list.add(inputStr);
      }

    } catch (NumberFormatException e) {
      System.out.println("数値でない値が入力されています");
    }
  }

}