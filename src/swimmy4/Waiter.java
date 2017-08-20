package swimmy4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Waiter {

	public Waiter() {

	}

	public void AskWater() {
		System.out.println("お水をお持ちしました");
	}

	public menu AskMenu() {
		System.out.println("メニューをお持ちします");
		System.out.println("どちらのメニューをお持ちしますか？");
		System.out.println("0:イタリアン　0以外:日本食");

		int iInputNo = InputStreamNumber();

		menu SelectMenu;

		//イタリアンが選択された場合
		if(iInputNo == 0) {
			System.out.println("イタリアンのメニューをお持ちしました");
			SelectMenu = new Italian();
			return SelectMenu;
		}
		//日本食が選択された場合
		else {
			System.out.println("日本食のメニューをお持ちしました");
			SelectMenu = new Japanese();
			return SelectMenu;
		}
	}

	public void OrderMenu(menu Order) {
		System.out.println("ご注文を承ります");

		while(true) {
			System.out.println("ご注文番号を教えてください");
			int iInputNo = InputStreamNumber();
			Order.SelectMenu(iInputNo);

			System.out.println("ご注文は以上ですか？");
			System.out.println("ご注文が以上の場合は0、続いてご注文する場合は1を押してください");

			iInputNo = InputStreamNumber();

			//0が入力されたら抜ける
			if(iInputNo == 0) {
				break;
			}
		}
		System.out.println("オーダーを受け付けました");
	}

	private int InputStreamNumber() {
		String str;
		int ret = 0;
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			str = br.readLine();
			ret = Integer.valueOf(str).intValue();
	}
		catch(IOException e) {
			System.out.println(e);
		}
		return ret;
		}
}
