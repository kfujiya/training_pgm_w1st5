package y2023;

/**
 * 【要件】
 * 1から100まで、改行しながら順番に出力してください。
 * ただし、出力しようとした数字が以下の条件の場合、代わりに “hoge” と出力してください。
 * ・３の倍数である。
 * ・どこかの桁に３がある数である。
 * 【条件】
 * ・入力を受け付ける必要はありません。
 * ・「3の倍数」と「３のつく数」は順番に１個ずつ考えてください。
 * 
 * @author y-hotta
 * @since 1.0.0 2023/08/20
 * @version 1.0.0 初期作成
 */

public class PG4_3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			//3の倍数チェック
			if (i % 3 == 0) {
				System.out.println("hoge");
				continue;
			}

			//iを直接使うとループ条件が崩れるのでnumに置き換える
			int num = i;
			//どこかの桁に3があったらtrue
			boolean judge_3 = false;

			//numが3のつく数かチェック
			while (num != 0) {
				//一の位の桁が3かチェック（例:8%10 = 8, 13%10 = 3)
				if (num % 10 == 3) {
					judge_3 = true;
					break;
				}
				/* 1桁の数の場合は0(ループ条件から外れる)
				 * 2桁の数の場合は10の位を代入
				 * 切り捨て（例:8/10 = 0, 38/10 = 3, 43/10 = 4）
				 */
				num /= 10;
			}

			if (judge_3) {
				System.out.println("hoge");
			} else {
				System.out.println(i);
			}

		}
	}

}
