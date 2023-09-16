package y2023;

/**
 * 【要件】
 * 掛け算九九の表を出力するプログラムを作成してください。
 * 【条件】
 * ・1桁の数は “01” ではなく “ 1” とする
 * ・入力を受け付ける必要はありません
 * （掛ける数, 掛けられる数, 罫線は任意です。難しいなら省略可！）
 * 
 * @author y-hotta
 * @since 1.0.0 2023/08/20
 * @version 1.0.0 初期作成
 */

public class PG4_2 {

	public static void main(String[] args) {
		int cnt = 0;
		//1行目の出力
		System.out.print("   |");
		for (int x = 1; x <= 9; x++) {
			System.out.print(" " + x + " ");
			cnt++;
		}
		System.out.print("\n");
		//2行目の出力
		while (cnt >= 0) {
			System.out.print("---");
			cnt--;
		}
		System.out.println();
		//段と本体
		for (int y = 1; y <= 9; y++) {
			//段
			System.out.print(" " + y + " |");
			//本体
			for (int x = 1; x <= 9; x++) {
				int num = y * x;
				//桁をそろえるために1桁の場合にスペースを入れる
				if (num < 10) {
					System.out.print(" " + num);
				} else {
					System.out.print(num);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
