import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeatCount = scanner.nextInt(); // 繰り返し回数を渡す
        List<String> words = new ArrayList<>(); // 単語を入れるリスト

        for (int i = 0; i < repeatCount; i++) {
            words.add(scanner.next()); // 単語をリストに加える
            if (isSameAsPrevious(words)) {
                System.out.println("もう見た");
            } else {
                System.out.println("かわいい～");
            }
        }
    }
    //すでに登場した単語かどうかを判定するメソッド
    public static boolean isSameAsPrevious(List<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            if (words.get(i).equals(words.get((words.size() - 1)))) {
                return true; // すでに登場した単語がある場合はtrueを返す
            }
        }
        return false; // すでに登場した単語がない場合はfalseを返す
    }
}