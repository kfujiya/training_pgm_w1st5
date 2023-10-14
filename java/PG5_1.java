package y2023;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 【要件】
 * 文字列がいくつか渡されるので、それぞれ回文であるか判定し、
 * “Yes”, “No” のどちらかを出力してください。
 * 【条件】
 * ・入力は1行目に数字X, 以降は文字列がX個渡されます。k番目の文字列をSkと呼びます(1≦k≦X)。
 * ・Xは1以上30以下, Skは31文字以下の英小文字と半角スペースです。
 * ・Skの半角スペースは無視し、英小文字が回文となっているかで判定してください。
 * 
 * @author y-hotta
 * @since 1.0.0 2023/08/20
 * @version 1.0.0 初期作成
 */

public class PG5_1 {

	public static void main(String[] args) {
		int X;
		String word;
		boolean result;
		//英小文字と半角スペースの正規表現
		String regex_AlphaSpace = "^[ a-z]+$";

		try (Scanner sc = new Scanner(System.in)) {
			String err_x = "Xは1以上30以下の整数";
			
			// Xが1以上30以下の整数かチェック、正しい値が入力されるまでループ
			while (true) {
				try {
					System.out.print("X:");
					X = Integer.parseInt(sc.nextLine());
					if (X >= 1 && X <= 30) {
						break;
					} else {
						System.out.println(err_x);
					}
				// Xに整数以外入力時のエラーキャッチ
				} catch (NumberFormatException e) {
					System.out.println(err_x);
				}
			}
			
			// 文字列をX回、回文であるかチェック
			for (int i = 0; i < X; i++) {
				String err_Sk = "S" + (i + 1) + "は31文字以下の英小文字と半角スペース";
				String Sk = "S" + (i + 1) + ":";
				
				// Skが31文字以下の英小文字と半角スペースかチェック
				// 正しい値が入力されるまでループ
				while (true) {
					System.out.print(Sk);
					word = sc.nextLine();

					// 31文字以下かチェック
					if (word.length() >= 31) {
						System.out.println(err_Sk);
					// 正規表現チェックメソッド
					} else if (!(checkRegex(regex_AlphaSpace, word))) {
						System.out.println(err_Sk);
					} else {
						break;
					}

				}

				// 半角スペースを取り除く
				word = word.replace(" ", "");
				// 回文チェックメソッド
				result = checkPalindrome(word);

				if (result) {
					System.out.println(Sk + "Yes");
				} else {
					System.out.println(Sk + "No");
				}
			}
			System.out.print("--- END ---");
		}

	}

	/**
	 * 指定した正規表現で文字列を照合するメソッド。
	 * @param regex 正規表現パターン
	 * @param word 対象文字列
	 * @return result 検査対象が正規表現にマッチする場合はtrue、それ以外はfalse
	 * 
	 */
	public static boolean checkRegex(String regex, String word) {
		boolean result = true;
		// 今回は両方あり得ないと思うが念のため
		if (word == null || word.isEmpty()) {
			return false;
		}
		// 引数に指定した正規表現regexがwordにマッチするか確認する
		// 正規表現パターンの読み込み
		Pattern p = Pattern.compile(regex);
		// パターンと対象文字列の照合
		Matcher m = p.matcher(word);
		// 照合結果をtrueかfalseで取得
		result = m.matches();
		return result;
	}

	/**
	 * 回文であるかチェックするためのメソッド
	 * @param word 検査対象文字列
	 * @return result 検査対象が回文の場合はtrue、それ以外はfalse
	 * 
	 */
	public static boolean checkPalindrome(String word) {
		boolean result = true;
		// 
		if (word == null || word.isBlank() || word.length() < 2) {
			return false;
		}
		//文字列を反転させた変数を用意
		String rstr = new StringBuilder(word).reverse().toString();
		result = word.equals(rstr);
		return result;
	}
}
