package swimmy4;

public class Italian extends menu{

	//コンストラクタ
	public Italian() {

	}

	//menuを表示する
	public void ShowMenu() {
		System.out.println("1.ペペロンチーノ");
		System.out.println("2.マルガリータ");
		System.out.println("3.フォンデュ");
	}

	public void SelectMenu(int aNo) {

		switch(aNo) {

		case 1:
			System.out.println("ペペロンチーノがオーダーされました");
			break;

		case 2:
			System.out.println("マルガリータがオーダーされました");
			break;

		case 3:
			System.out.println("フォンデュがオーダーされました");
			break;

		default:
			System.out.println("オーダー番号が不正です");
			break;

		}
	}
}
