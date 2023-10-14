package y2023;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 【要件】
 * 文字列がいくつか渡されるので、既に登場したか判断してください。
 * 【条件】
 * ・入力は1行目に数字X, 以降は文字列がX個渡されます。k番目の文字列をSkと呼びます(1≦k≦X)。
 * ・Xは1以上1000以下, Skは100文字以下です。
 * ・初めて登場した文字列には “かわいい～”、
 * 過去渡された物と同じ文字列には“もう見た”をそれぞれ出力してください。
 * 
 * @author y-hotta
 * @since 1.0.0 2023/08/20
 * @version 1.0.0 初期作成
 */

public class PG5_3 {

	public static void main(String[] args) {
		
		// 順番を持たず、重複を許さない
		Set<String> set = new HashSet<String>();
		int X;

		try (Scanner sc = new Scanner(System.in)) {
			String err_x = "Xは1以上1000以下の整数";
			
			// Xは1以上100以下の整数かチェック、正しい値が入力されるまでループ
			while (true) {
				try {
					System.out.print("X:");
					X = Integer.parseInt(sc.nextLine());
					// Xは1以上1000以下チェック
					if (X >= 1 && X <= 1000) {
						break;
					} else {
						System.out.println(err_x);
					}
					// Xに整数以外入力時のエラーキャッチ
				} catch (NumberFormatException e) {
					System.out.println(err_x);
				}
			}
			
			//SをX回繰り返す
			for (int i = 0; i < X; i++) {
				String word;
				String Sk = "S" + (i + 1) + ":";
				//Skが100文字以下チェック、正しい値が入力されるまでループ
				while (true) {
					System.out.print(Sk);
					word = sc.next();
					//Skが100文字以下チェック
					if (word.length() <= 100) {
						break;
					} else {
						System.out.println("文字列は100文字以下です");
					}
				}
				
				// set.add()の戻り値は、成功したらtrue、失敗したらfalseらしい
				if (set.add(word)) {
					System.out.println(Sk + "かわいい～");
				} else {
					System.out.println(Sk + "もう見た");
				}
			}
			
			System.out.print("--- END ---");
		}

	}

}
