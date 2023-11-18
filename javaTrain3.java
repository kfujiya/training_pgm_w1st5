import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //目的座標入力
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();
        
        //原点
        int beginX = 0;
        int beginY = 0;
        
        //最小移動回数出力
        int minMoves = calcMinMoves(beginX, beginY, x, y);
        System.out.println(minMoves);
    }
    
    public static int calcMinMoves(int beginX, int beginY, int endX, int endY) {
        
        //目的座標と原点の差
        int changeposX = Math.abs(endX - beginX);
        int changeposY = Math.abs(endY - beginY);
        
        //最小移動回数計算処理
        int maxPos = Math.max(changeposX, changeposY);
        int minMoves = (maxPos + 2) / 3;
        if ((changeposX + changeposY) % 2 != 0) {
            minMoves += 1;
        }

        return minMoves;
    }
}
