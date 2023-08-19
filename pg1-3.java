import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0) {
        // 3の倍数
        System.out.println("hoge");
      } else if (Integer.toString(i).contains("3")) {
        // 3のつく数字
        System.out.println("hoge");
      } else {
        // それ以外
        System.out.println(i);
      }
    }
  }
}

