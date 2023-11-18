import java.util.*;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.awt.Point;

public class Main {
    public static void main(String[] args) throws Exception {
        //目標地点の入力規則は『"X Y"』
        //""を除いたStringを作る
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.replace("\"","");
        
        /*「\"」除外確認用
        System.out.print(b);*/
        
        //空白で区切る
        String[] xy = b.split(" ");
        //int配列に変換(Stream)
        int[] XY = Stream.of(xy).mapToInt(Integer::parseInt).toArray();
        
        /*配列確認用
        for (int i = 0; i < 2; i++) {
            System.out.println(i + ":" + XY[i]);
        }*/
       
        //int[] XYには言いた数字を座標に設定する
        int X = 0;
        int Y = 0;
        int count = 0;
        
        while(count < 2){
            if(count == 0){
                X= XY[0];
                count++;
            }
            if(count == 1){
                Y= XY[1];
                count++;
            }
        }
        /*int X,Y確認用
        System.out.println(X);
        System.out.print(Y);*/
        
        //現在座標から八方向を確認するための定数
        Point[] rootPattarns = {new Point(1,2), new Point(-1,2), new Point(-1,-2), new Point(1,-2), 
        new Point(2,1), new Point(-2,1), new Point(-2,-1), new Point(2,-1)};
        //入力した目標座標
        Point gP = new Point(X, Y);
        //移動回数カウント用
        int stepCount = 1;
        //目標座標にゴールしたらtrueにする
        boolean isGoal = false;
        
        
        // 一回目の経路は目標地点の座標の正負から判断をする2方向のみにする（処理の簡略化）
        //最初の方角を決めるためのリスト
        ArrayList<Integer> firstRootX = new ArrayList<>();
        ArrayList<Integer> firstRootY = new ArrayList<>();
        
        if (X >= 0)
        {
            firstRootX.add(1);
            firstRootX.add(2);
        }
        else
        {
            firstRootX.add(-1);
            firstRootX.add(-2);
        }
        
        if (Y >= 0)
        {
            firstRootY.add(1);
            firstRootY.add(2);
        }
        else
        {
            firstRootY.add(-1);
            firstRootY.add(-2);
        }
        // rootHistory：通ることができた座標を記録、rootBranch：(n-1)手目で通った座標の候補を格納
        ArrayList<Point> rootHistory = new ArrayList<>();
        ArrayList<Point> rootBranch = new ArrayList<>();
        
        // 1手目の座標を2手目の開始地点座標として保持
        rootBranch.add(new Point(firstRootX.get(0), firstRootY.get(1)));
        rootBranch.add(new Point(firstRootX.get(1), firstRootY.get(0)));
        rootHistory.add(new Point(0, 0));
        rootHistory.add(new Point(firstRootX.get(0), firstRootY.get(1)));
        rootHistory.add(new Point(firstRootX.get(1), firstRootY.get(0)));
        
        // 経路の中にゴールが含まれているか判定
        for (int i = 0; i < rootHistory.size(); i++)
        {
            //8つの移動パターンと目標座標が一致する場合移動回数1を出力する
            if (gP.equals(rootHistory.get(i)))
            {
                isGoal = true;
                break;
            }
        }
        
        if (isGoal)
        {
            System.out.println("最小移動回数は" + stepCount + "回です");
            return;
        }
        
        
        //移動回数が１以上（n>=2）の場合以下
        while (true)
        {
            stepCount++;
            //前の週(n-1)で通った座標からn回目に行ける座標の候補を格納
            ArrayList<Point> nowRootBranch = new ArrayList<>();
            for (int i = 0; i < rootBranch.size(); i++)
            {
                for (int j = 0; j < 8; j++)
                {
                    //前の週で通った座標から進んだ後の座標候補
                    Point root = new Point(rootBranch.get(i).x + rootPattarns[j].x, rootBranch.get(i).y + rootPattarns[j].y);
                    //rootがすでにHistoryに格納されているかを調べる
                    for (int k = 0; k < rootHistory.size(); k++)
                    {
                        //まだ通ったことのない座標だったらHistoryに格納(すでにHistoryにある座標なら早く到達するbranchが過去にあったことになるためその方向は最短ではない)。
                        if (!root.equals(rootHistory.get(k)))
                        {
                            nowRootBranch.add(root);
                            rootHistory.add(root);
                            break;
                        }
                    }
                }
            }
            // 経路(nowRootBranch)の中にゴールが含まれているか判定、含まれていれば回数を出力
            for (int i = 0; i < nowRootBranch.size(); i++)
            {
                if (gP.equals(nowRootBranch.get(i)))
                {
                    isGoal = true;
                    break;
                }
            }
            // rootBranchにこの週の分岐を入れて次の週の開始座標として使用
            rootBranch = nowRootBranch;
            
            if (isGoal)
            {
                System.out.println("最小移動回数は" + stepCount + "回です");
                break;
            }
        }
    }
}

