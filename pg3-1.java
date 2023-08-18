import java.util.*;

public class Main {
    
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
        final int N = 10;
        int[][] board = new int[N+1][N+1];
        Queue<Position> queue = new ArrayDeque<>();
        
        // �W�����͂��擾
        Scanner sc = new Scanner(System.in);
        
        // �ړI���W
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        
        // ���ݍ��W
        int currentX = 0;
        int currentY = 0;
        
        for (int i=0; i<=N; i++) {
            for (int j=0; j<=N; j++) {
                board[i][j] = -1;
            }
        }
        
        // ������Ԑݒ�
        board[currentY][currentX] = 0;
        queue.add(new Position(currentX, currentY));
        
        // �񐔌v�Z
        while (queue.peek() != null) {
            Position n = queue.poll();
            // x+1 y+2
            if (n.getX()+1 >= 0 && n.getY()+2 >= 0 && n.getX()+1 <= N && n.getY()+2 <= N && board[n.getY()+2][n.getX()+1] == -1) { 
                queue.add(new Position(n.getX()+1, n.getY()+2));
                board[n.getY()+2][n.getX()+1] = board[n.getY()][n.getX()] + 1;
            }
            // x+2 y+1
            if (n.getX()+2 >= 0 && n.getY()+1 >= 0 && n.getX()+2 <= N && n.getY()+1 <= N && board[n.getY()+1][n.getX()+2] == -1) { 
                queue.add(new Position(n.getX()+2, n.getY()+1));
                board[n.getY()+1][n.getX()+2] = board[n.getY()][n.getX()] + 1;
            }
            // x-1 y+2
            if (n.getX()-1 >= 0 && n.getY()+2 >= 0 && n.getX()-1 <= N && n.getY()+2 <= N && board[n.getY()+2][n.getX()-1] == -1) { 
                queue.add(new Position(n.getX()-1, n.getY()+2));
                board[n.getY()+2][n.getX()-1] = board[n.getY()][n.getX()] + 1;
            }
            // x-2 y+1
            if (n.getX()-2 >= 0 && n.getY()+1 >= 0 && n.getX()-2 <= N && n.getY()+1 <= N && board[n.getY()+1][n.getX()-2] == -1) { 
                queue.add(new Position(n.getX()-2, n.getY()+1));
                board[n.getY()+1][n.getX()-2] = board[n.getY()][n.getX()] + 1;
            }
            // x+1 y-2
            if (n.getX()+1 >= 0 && n.getY()-2 >= 0 && n.getX()+1 <= N && n.getY()-2 <= N && board[n.getY()-2][n.getX()+1] == -1) { 
                queue.add(new Position(n.getX()+1, n.getY()-2));
                board[n.getY()-2][n.getX()+1] = board[n.getY()][n.getX()] + 1;
            }
            // x+2 y-1
            if (n.getX()+2 >= 0 && n.getY()-1 >= 0 && n.getX()+2 <= N && n.getY()-1 <= N && board[n.getY()-1][n.getX()+2] == -1) { 
                queue.add(new Position(n.getX()+2, n.getY()-1));
                board[n.getY()-1][n.getX()+2] = board[n.getY()][n.getX()] + 1;
            }
            // x-1 y-2
            if (n.getX()-1 >= 0 && n.getY()-2 >= 0 && n.getX()-1 <= N && n.getY()-2 <= N && board[n.getY()-2][n.getX()-1] == -1) { 
                queue.add(new Position(n.getX()-1, n.getY()-2));
                board[n.getY()-2][n.getX()-1] = board[n.getY()][n.getX()] + 1;
            }
            // x-2 y-1
            if (n.getX()-2 >= 0 && n.getY()-1 >= 0 && n.getX()-2 <= N && n.getY()-1 <= N && board[n.getY()-1][n.getX()-2] == -1) { 
                queue.add(new Position(n.getX()-2, n.getY()-1));
                board[n.getY()-1][n.getX()-2] = board[n.getY()][n.getX()] + 1;
            }
            
        }
        
        // �񐔊m�F
        /* for (int i=N; i >= 0; i--)  {
            for (int j = 0; j <= N; j++) {
                System.out.print(String.format("%02d ", board[i][j]));
            }
                System.out.println();
        } */
        
        // �w�肳�ꂽ���W�̍ŏ��ړ��񐔂�\��
        System.out.print(board[Y][X]);
        
    }
}
