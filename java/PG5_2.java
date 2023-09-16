package y2023;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 【要件】
 * 文字列が渡されるので、その中に含まれる回文で最長のものを出力してください。
 * 【条件】
 * ・入力は256文字以下の英小文字です。
 * ・1文字では回文とは呼びません。最小でも2文字必要とします。
 * 
 * @author y-hotta
 * @since 1.0.0 2023/08/20
 * @version 1.0.0 初期作成
 */

public class PG5_2 {

	public static void main(String[] args) {

		//入力された文字列strと文字数len
		String str = "";
		int str_len = 0;

		//最長回文の文字数len
		int max_len = 0;

		//最長回文のデータ格納
		ArrayList<String> list = new ArrayList<String>();

		//英小文字の正規表現
		String regex_Alpha = "^[a-z]+$";

		try (Scanner sc = new Scanner(System.in)) {
			String err_str = "入力は256文字以下の英小文字です";
			
			// 256文字以下の英小文字かチェック、正しい値が入力されるまでループ
			while (true) {
				str = sc.nextLine();
				str_len = str.length();
				// 256文字以下かチェック
				if (str_len >= 256) {
					System.out.println(err_str);
					// 正規表現判定メソッド
				} else if (!(checkRegex(regex_Alpha, str))) {
					System.out.println(err_str);
				} else {
					break;
				}
			}
			
			//回文チェック
			if (str_len < 2) {
				System.out.println("1文字では回文とは呼びません。最小でも2文字必要とします。");
			} else {
				/* 
				 * 1文字目から最後の文字まで(最後-2まで？)対象の文字をとる
				 * 対象の文字＋２した文字から、一文字づつ順番に最後まで文字をとる
				 * 回文チェックする
				 */
				for (int s = 1; s < str_len; s++) {
					for (int e = s + 2; e < str_len + 2; e++) {
						
						String sub_str = str.substring(s - 1, e - 1);
						String sub_rstr = new StringBuilder(sub_str).reverse().toString();

						//回文であったとき、これまでの最長回文の文字数と比較、更新チェック
						if (sub_str.equals(sub_rstr)) {
							String result = sub_str + "(" + s + "-" + (e - 1) + "番目の文字)";
							//最長更新の場合
							if (max_len < (e - s)) {
								max_len = (e - s);
								// 格納リセット
								list.clear();
								list.add(result);
							// 最長と等しい場合
							} else if (max_len == (e - s)) {
								list.add(result);
							}
						}
					}
				}
				
				//結果出力
				if (max_len != 0) {
					System.out.println(max_len + "文字が最長の回文です。");
					for (String l : list) {
						System.out.println(l);
					}
				} else {
					System.out.println("該当なし");
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

}
