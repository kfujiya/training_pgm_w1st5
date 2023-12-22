import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Reversi {

	//メイン関数
	public static void main(String[] args) throws Exception {

		//ゲームの初期化。オブジェクトを作って、盤面を初期化する。
		Game game = new Game(Global.BOARD_SIZE);
		game.initialize();
		game.printBoard();        //初期化状態の出力

		//開始プレイヤーの色を決定する
		int player = BLACK;

		//前ターンはスキップだったか
		boolean isSkipBefore = false;

		//このターンスキップするか
		boolean skipFlag = false;

		//勝敗が決まるまで処理を行う
		do {

			// ここから各ターンの処理

			// ターンプレイヤーが置ける場所があるか確認する
			// ないならターン終了

			// あるなら
			// ターンプレイヤーが置ける場所を指示するまで
			do {

				// プレイヤーに入力を促す標準出力

				// 入力された座標に置けるか確認する
			} while( /** 置ける座標が入力されるまで **/ );

			// 入力された座標に石を配置して、可能な限りひっくり返す

			// 次のターンへ(ターンプレイヤーを入れ替える)
			
		} while ( /** 勝敗が決するまで or 2連続でスキップするまで **/ );

		//結果を出力する
		System.out.println("");
		game.PrintField();        //最終結果のフィールド表示
		game.PrintResult();
	}
}

/**
 * ゲーム処理本体
 */
class Game {
	// ゲームボード
	private int board[][];
	
	// ゲーム初期化(コンストラクタ)
	public Game(int boardSize) {
		board = new int[boardSize+2][boardSize+2];
	}

	// ボード初期化
	public void initialize() {

		//ボードサイズを取得, 真ん中の座標を定義
		int boardSize = board.length - 2;
		int half = boardSize / 2;

		// 縦(列)
		for(int y = 0; y < boardSize+2; y++) {

			// 横(行)
			for(int x = 1; x < boardSize+1; x++) {
				// 座標(x,y)の中身を空にする
				board[y][x] = Global.EMPTY;
			}

			// ボードの左右端を壁(石が置けない領域)にする
			board[y][0] = Global.WALL;
			board[y][boardSize+1] = Global.WALL;
		}

		// ボードの上下端を壁(石が置けない領域)にする
		for(int x = 1; x < boardSize+1; x++) {
			// please write down
			board[0][x] = Global.WALL;
			board[boardSize+1][x] = Global.WALL;
		}
		
		// 真ん中に初期石を置く
		// please write down
		board[half][half] = Global.WHITE;
		board[half][half+1] = Global.BLACK;
		board[half+1][half] = Global.BLACK;
		board[half+1][half+1] = Global.WHITE;
	}
	
	// 盤面を出力する
	void printBoard() {
		
		// ボードサイズを取得
		int boardSize = board.length;

		// 縦(列)
		for(int y = 0; y < boardSize; y++) {

			// 横(行)
			for(int x = 0; x < boardSize; x++) {
				
				// 種類によって表示を出し分ける
				if(board[y][x] == Global.WALL) {
					System.out.print("□");
				} else if(board[y][x] == Global.BLACK) {
					System.out.print("●");
				} else if(board[y][x] == Global.WHITE) {
					System.out.print("○");
				} else if(board[y][x] == Global.EMPTY) {
					System.out.print("　");
				}
			}
			
			// 改行する
			System.out.println();
		}
		
		// 改行する
		System.out.println();
	}
	
	/** 特定の１方向(dx, dy)について、石が返せるか計算する
	 *  player : ターンプレイヤー
	 *  col : 石を置きたい座標(縦)
	 *  row : 石を置きたい座標(横)
	 *  dx  : 確認する方向(横)
	 *  dy  : 確認する方向(縦)
	 **/
	int checkStep(int player, int col, int row, int dx, int dy) {

		// 相手側の石の色調べる
		int enemy = player == Global.BLACK ? Global.WHITE : Global.BLACK;

		// (dx, dy) 方向に相手の石がある限り調べ続ける

		// 相手の石以外が見つかったとき、それが自分の石なら、調べた相手の石の数を返す
		// 自分の石でない(空または壁)だったら返せないので0を返す
	}

	/** ８方向に対して石を返せるか計算する
	 *  player : ターンプレイヤー
	 *  col : 石を置きたい座標(縦)
	 *  row : 石を置きたい座標(横)
	 **/
	int checkAction(int player, int col, int row) {

		// 返せる石の数メモ
		int count = 0;

		// 調べる方向を定義する(8方向)
		int[] dx = {1, 1, 0, -1, -1, -1,  0,  1};
		int[] dy = {0, 1, 1,  1,  0, -1, -1, -1}; 

		// そもそも(row, col)に石が置けないならダメ
		if(board[col][row] != Global.EMPTY) {
			return 0;
		}

		// 石を置けるなら、調べる８方向について
		for(int direction = 0; direction < dx.length; direction++) {
			// 「１方向だけ調べる関数」で返せる個数を調べる
			count += checkStep(player, col, row, dx[direction], dy[direction]);
		
		// ８方向の返せる数の合計を返す
		return count;
	}

	// 石を置ける場所のリストを出力する（使っても使わなくてもいいです）
	List<Point> getRegalHand(int player) {

		// ボードサイズ定義
		int boardSize = board.length - 2;

		// Listを作って合法手リストの準備
		List<Point> regalList = new ArrayList<Point>();

		// 縦(列)
		for(int y = 1; y <= boardSize; y++) {

			// 横(行)
			for(int x = 1; x <= boardSize; x++) {

				// ８方向確認して0でない(置けるし、1個以上反転できる)なら
				if(checkAction(player, x, y) != 0) {

					// 合法手リストに加える
					Point p = new Point();
					p.col = x;
					p.row = y;
					regalList.add(p);
				}
			}
		}

		// 合法手リストを返す
		return regalList;
	}

	/** 実際に８方向について石を置いて反転させる
	 *  player : ターンプレイヤー
	 *  col : 石を置きたい座標(縦)
	 *  row : 石を置きたい座標(横)
	 *  return count : 反転させた石の数
	 **/
	int action(int player, int col, int row) {

		//反転させた石の数
		int count = 0;

		// 調べる方向を定義する(8方向)
		int[] dx = {1, 1, 0, -1, -1, -1,  0,  1};
		int[] dy = {0, 1, 1,  1,  0, -1, -1, -1}; 

		// そもそも(row, col)に石が置けないならダメ
		if(board[col][row] != Global.EMPTY) {
			return 0;
		}

		// 石を置けるなら、調べる８方向について
		for(int direction = 0; direction < dx.length; direction++) {
	
			// 「１方向だけ調べる関数」で返せる個数を調べる
			int countDirection = checkStep(player, col, row, dx[direction], dy[direction]);

			// 実際に反転させる座標を保持する
			int reversePointX = col;
			int reversePointY = row;

			// 調べた方向に対し、調べた個数回、石をプレイヤーの色に反転させる。
			for (int countReverse = 0; countReverse < countDirection; countReverse++) {

				// 調べた方向に座標をずらしていき、反転する座標を設定
				reversePointX += dx[direction];
				reversePointY += dy[direction];

				// 反転させる
				board[reversePointY][reversePointX] = player;
			}

			// 反転した個数をカウント
			count += countDirection;
		}

		// 最後に置きたかった場所に石を置く
		board[row][col] = player;

		return count;
	}

	// 結果出力
	void printResult() {

		// 黒い石の数, 白い石の数
		int blackStone = 0;
		int whiteStone = 0;

		// 縦(列)
		for(int y = 0; y < board.length; y++) {
			// 横(行)
			for(int x = 0; x < board.length; x++) {
				// 座標(x,y)の石をチェック
				if(board[y][x] == Global.BLACK){
					blackStone++;
				}else if(board[y][x] == Global.WHITE){
					whiteStone++;
				}
			}
		}
		System.out.print("黒" + blackStone + ":白" + whiteStone + "で");

		// 黒が多ければ黒の勝ち、白が多ければ白の勝ち、同数なら...
		if(blackStone>whiteStone){
			System.out.println("黒の勝ち！");
		}else if(blackStone<whiteStone){
			System.out.println("白の勝ち！");
		}else{
			System.out.println("両者勝ち！");
		}
	}
}

/**
 * 二次元配列構造体
 */

class Point {
	int col;	// x
	int row;	// y
}


/**
 * グローバル値(石の色と勝敗定義)
 */
class Global {
	static final int BOARD_SIZE = 8;
	static final int WALL = 0;
	static final int BLACK = 1;
	static final int WHITE = 2;
	static final int EMPTY = 3;

	static final int DRAW  = 0;	//勝敗用[引き分け]
	static final int LEFT  = 1;	//勝敗用[黒勝利]
	static final int RIGHT = 2; //勝敗用[白勝利]
}
