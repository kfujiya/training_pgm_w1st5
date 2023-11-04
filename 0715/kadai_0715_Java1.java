import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        // 盤面 N*N行列
        // memo:取り急ぎ10*10で固定
        int N = 11;
        int[][] board = new int[N][N];

        // ナイトの動き 8方向
        int[][] moves = {
                { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },
                { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }
        };

        Scanner scanner = new Scanner(System.in);

        // 入力
        System.out.println("例：a=3,b=2を入力する場合");
        System.out.println("\"3 2\"");
        System.out.println("と入力すること");
        int targetA = scanner.nextInt();
        int targetB = scanner.nextInt();

        System.out.println("aは" + targetA);
        System.out.println("bは" + targetB);

        if (N < targetA || N < targetB) {
            System.out.println("AとBは、" + N + "以下の数字を入力してください。");
        } else {
            // スタート地点
            int startA = 0;
            int startB = 0;

            // キューにスタート地点を挿入
            Queue<Point> queue = new LinkedList<>();
            queue.offer(new Point(startA, startB));
            board[startA][startB] = 0;

            while (!queue.isEmpty()) {
                // キューから挿入した座標を取り出し current = 現在
                Point currentPosition = queue.poll();
                int currentA = currentPosition.a;
                int currentB = currentPosition.b;

                // キューから取り出した座標が入力した座標と一致の場合
                if (currentA == targetA && currentB == targetB) {
                    System.out.println("最小移動回数は" + board[currentA][currentB] + "回");
                }
                // ナイトの動きを全パターン実行
                for (int[] move : moves) {
                    // 動いた後の座標を設定
                    int nextA = currentA + move[0];
                    int nextB = currentB + move[1];

                    // 動いた後の座標が、盤面（N*N行列）を超過していない、
                    // かつ、移動回数が未設定（1回も移動したことのない座標に移動した）場合
                    if (nextA >= 0 && nextA < N && nextB >= 0 && nextB < N && board[nextA][nextB] == 0) {
                    
                        // キューから取り出した座標の移動回数に+1をし、今回の座標の移動回数を反映
                        board[nextA][nextB] = board[currentA][currentB] + 1;
                        
                        // キューに今回の座標を挿入
                        queue.offer(new Point(nextA, nextB));
                    }
                }
            }
        }
    }

    static class Point {
        int a;
        int b;

        public Point(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}