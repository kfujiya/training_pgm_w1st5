import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                System.out.println("hoge");
            } else {
                System.out.println(i);
            }
        }
    }
}
