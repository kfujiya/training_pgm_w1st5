import java.util.*;
public class Main {
  public static void main(String[] args) throws Exception {
    for (int i = 1; i < 10; i++) {
      if (i == 1) {
        System.out.println(" | 1  2  3  4  5  6  7  8  9 ");
        System.out.println("-----------------------------");
      }
      for (int j = 1; j < 10; j++) {
        if (j == 1) {
          System.out.print(i + "|");
        }
        System.out.printf("%2d",i * j);
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}
