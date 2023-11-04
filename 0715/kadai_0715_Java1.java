import java.util.*;

public class Main {
    public static void main(String[] args) {
    	
        // �Ֆ� N*N�s��
        // memo:���}��10*10�ŌŒ�
        int N = 11;
        int[][] board = new int[N][N];

        // �i�C�g�̓��� 8����
        int[][] moves = {
                { 2, 1 }, { 1, 2 }, { -1, 2 }, { -2, 1 },
                { -2, -1 }, { -1, -2 }, { 1, -2 }, { 2, -1 }
        };

        Scanner scanner = new Scanner(System.in);

        // ����
        System.out.println("��Fa=3,b=2����͂���ꍇ");
        System.out.println("\"3 2\"");
        System.out.println("�Ɠ��͂��邱��");
        int targetA = scanner.nextInt();
        int targetB = scanner.nextInt();

        System.out.println("a��" + targetA);
        System.out.println("b��" + targetB);

        if (N < targetA || N < targetB) {
            System.out.println("A��B�́A" + N + "�ȉ��̐�������͂��Ă��������B");
        } else {
            // �X�^�[�g�n�_
            int startA = 0;
            int startB = 0;

            // �L���[�ɃX�^�[�g�n�_��}��
            Queue<Point> queue = new LinkedList<>();
            queue.offer(new Point(startA, startB));
            board[startA][startB] = 0;

            while (!queue.isEmpty()) {
                // �L���[����}���������W�����o�� current = ����
                Point currentPosition = queue.poll();
                int currentA = currentPosition.a;
                int currentB = currentPosition.b;

                // �L���[������o�������W�����͂������W�ƈ�v�̏ꍇ
                if (currentA == targetA && currentB == targetB) {
                    System.out.println("�ŏ��ړ��񐔂�" + board[currentA][currentB] + "��");
                }
                // �i�C�g�̓�����S�p�^�[�����s
                for (int[] move : moves) {
                    // ��������̍��W��ݒ�
                    int nextA = currentA + move[0];
                    int nextB = currentB + move[1];

                    // ��������̍��W���A�ՖʁiN*N�s��j�𒴉߂��Ă��Ȃ��A
                    // ���A�ړ��񐔂����ݒ�i1����ړ��������Ƃ̂Ȃ����W�Ɉړ������j�ꍇ
                    if (nextA >= 0 && nextA < N && nextB >= 0 && nextB < N && board[nextA][nextB] == 0) {
                    
                        // �L���[������o�������W�̈ړ��񐔂�+1�����A����̍��W�̈ړ��񐔂𔽉f
                        board[nextA][nextB] = board[currentA][currentB] + 1;
                        
                        // �L���[�ɍ���̍��W��}��
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