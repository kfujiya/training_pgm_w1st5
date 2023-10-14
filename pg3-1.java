import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        // 盤面 N*N行列
        // memo:取り急ぎ10*10で固定
        int N = 11;
        int[][] board = new int[N][N];

        // ナイトの動き
        int[][] moves = {
                { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },
                { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }
        };

        Scanner scanner = new Scanner(System.in);

        // 入力
        System.out.println("例：x=3,Y=2を入力する場合");
        System.out.println("\"3 2\"");
        System.out.println("と入力すること");
        int targetX = scanner.nextInt();
        int targetY = scanner.nextInt();

        System.out.println("xは" + targetX);
        System.out.println("yは" + targetY);

        if (N < targetX || N < targetY) {
            System.out.println("XとYは、" + N + "以下の数字を入力してください。");
        } else {
            // スタート地点
            int startX = 0;
            int startY = 0;

            // キューにスタート地点を挿入
            Queue<Point> queue = new LinkedList<>();
            queue.offer(new Point(startX, startY));
            board[startX][startY] = 0;

            while (!queue.isEmpty()) {
                // キューから挿入した座標を取り出し
                Point currentPosition = queue.poll();
                int currentX = currentPosition.x;
                int currentY = currentPosition.y;

                // キューから取り出した座標が入力した座標と一致の場合
                if (currentX == targetX && currentY == targetY) {
                    System.out.println("最小移動回数は" + board[currentX][currentY] + "回");
                }
                // ナイトの動きを全パターン実行
                for (int[] move : moves) {
                    // 動いた後の座標を設定
                    int nextX = currentX + move[0];
                    int nextY = currentY + move[1];

                    // 動いた後の座標が、盤面（N*N行列）を超過していない、
                    // かつ、移動回数が未設定（1回も移動したことのない座標に移動した）場合
                    if (nextX >= 0 && nextX < N && nextY >= 0 && nextY < N && board[nextX][nextY] == 0) {
                        // キューから取り出した座標の移動回数に+1をし、今回の座標の移動回数を反映
                        board[nextX][nextY] = board[currentX][currentY] + 1;
                        // キューに今回の座標を挿入
                        queue.offer(new Point(nextX, nextY));
                    }
                }
            }
        }
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}