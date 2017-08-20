package swimmy4;

public class SwimmyEducation4_3 {

	public static void main(String args[]) {

		//鈴木さんというウェイターさんを作成
		Waiter Suzuki = new Waiter();

		//水を要求する
		Suzuki.AskWater();

		//ウェイターにメニューを要求する
		menu SelectMenu = Suzuki.AskMenu();

		//メニューを表示する
		SelectMenu.ShowMenu();

		//ウェイターにオーダーを要求する
		Suzuki.OrderMenu(SelectMenu);
	}

}
