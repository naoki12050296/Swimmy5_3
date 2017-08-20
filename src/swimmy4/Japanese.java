package swimmy4;

public class Japanese extends menu {

	//コンストラクタ
	public Japanese() {

	}

	//menuを表示する
	public void ShowMenu() {
		System.out.println("1.お寿司");
		System.out.println("2.そば");
		System.out.println("3.うどん");

	}

	public void SelectMenu(int aNo) {

		switch(aNo) {

		case 1:
			System.out.println("お寿司がオーダーされました");
			break;

		case 2:
			System.out.println("そばがオーダーされました");
			break;

		case 3:
			System.out.println("うどんがオーダーされました");
			break;

		default :
			System.out.println("オーダー番号が不正です");
			break;

		}
	}
}
