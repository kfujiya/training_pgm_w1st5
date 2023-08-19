import java.util.*;

public class Main {
    
    // 移動後の座標を保持するクラス
    public static class Position {
        private int x;
        private int y;
        
        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        public int getX() {
            return this.x;
        }
        
        public int getY() {
            return this.y;
        }
    }
    
    public static void main(String[] args) throws Exception {
        // pg3-1
        
        // 盤面の範囲を設定し作成
        final int N = 10;
        int[][] board = new int[N+1][N+1];
        Queue<Position> queue = new ArrayDeque<>();
        
        // 盤面を-1で初期化
        for (int i=0; i<=N; i++) {
            for (int j=0; j<=N; j++) {
                board[i][j] = -1;
            }
        }
        
        // 標準入力を取得
        Scanner sc = new Scanner(System.in);
        
        // 目的座標
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        
        // 現在座標
        int currentX = 0;
        int currentY = 0;
        
        // 初期状態設定（0, 0）
        board[currentY][currentX] = 0;
        queue.add(new Position(currentX, currentY));
        
        // 移動回数計算((0,0)から(10,10)の範囲内かつ未探索(-1)であれば移動後の座標をキューに挿入)
        while (queue.peek() != null) {
            // 移動元座標を取得
            Position n = queue.poll();
            
            // x+1 y+2 移動
            if (n.getX()+1 >= 0 && n.getY()+2 >= 0 && n.getX()+1 <= N && n.getY()+2 <= N && board[n.getY()+2][n.getX()+1] == -1) { 
                queue.add(new Position(n.getX()+1, n.getY()+2));
                board[n.getY()+2][n.getX()+1] = board[n.getY()][n.getX()] + 1;
            }
            // x+2 y+1 移動
            if (n.getX()+2 >= 0 && n.getY()+1 >= 0 && n.getX()+2 <= N && n.getY()+1 <= N && board[n.getY()+1][n.getX()+2] == -1) { 
                queue.add(new Position(n.getX()+2, n.getY()+1));
                board[n.getY()+1][n.getX()+2] = board[n.getY()][n.getX()] + 1;
            }
            // x-1 y+2 移動
            if (n.getX()-1 >= 0 && n.getY()+2 >= 0 && n.getX()-1 <= N && n.getY()+2 <= N && board[n.getY()+2][n.getX()-1] == -1) { 
                queue.add(new Position(n.getX()-1, n.getY()+2));
                board[n.getY()+2][n.getX()-1] = board[n.getY()][n.getX()] + 1;
            }
            // x-2 y+1 移動
            if (n.getX()-2 >= 0 && n.getY()+1 >= 0 && n.getX()-2 <= N && n.getY()+1 <= N && board[n.getY()+1][n.getX()-2] == -1) { 
                queue.add(new Position(n.getX()-2, n.getY()+1));
                board[n.getY()+1][n.getX()-2] = board[n.getY()][n.getX()] + 1;
            }
            // x+1 y-2 移動
            if (n.getX()+1 >= 0 && n.getY()-2 >= 0 && n.getX()+1 <= N && n.getY()-2 <= N && board[n.getY()-2][n.getX()+1] == -1) { 
                queue.add(new Position(n.getX()+1, n.getY()-2));
                board[n.getY()-2][n.getX()+1] = board[n.getY()][n.getX()] + 1;
            }
            // x+2 y-1 移動
            if (n.getX()+2 >= 0 && n.getY()-1 >= 0 && n.getX()+2 <= N && n.getY()-1 <= N && board[n.getY()-1][n.getX()+2] == -1) { 
                queue.add(new Position(n.getX()+2, n.getY()-1));
                board[n.getY()-1][n.getX()+2] = board[n.getY()][n.getX()] + 1;
            }
            // x-1 y-2 移動
            if (n.getX()-1 >= 0 && n.getY()-2 >= 0 && n.getX()-1 <= N && n.getY()-2 <= N && board[n.getY()-2][n.getX()-1] == -1) { 
                queue.add(new Position(n.getX()-1, n.getY()-2));
                board[n.getY()-2][n.getX()-1] = board[n.getY()][n.getX()] + 1;
            }
            // x-2 y-1 移動
            if (n.getX()-2 >= 0 && n.getY()-1 >= 0 && n.getX()-2 <= N && n.getY()-1 <= N && board[n.getY()-1][n.getX()-2] == -1) { 
                queue.add(new Position(n.getX()-2, n.getY()-1));
                board[n.getY()-1][n.getX()-2] = board[n.getY()][n.getX()] + 1;
            }
            
        }
        
        // 盤面の移動回数の確認
        /* for (int i=N; i >= 0; i--)  {
            for (int j = 0; j <= N; j++) {
                System.out.print(String.format("%02d ", board[i][j]));
            }
                System.out.println();
        } */
        
        // 指定された座標の最小移動回数を表示
        System.out.print(board[Y][X]);
        
    }
}
