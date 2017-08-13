package swimmypractice5;

public class Main {

	public static void main(String[] args) throws Exception {


	try {

		//Iphoneのインスタンスを生成（同時にOSを設定し、名前を入力する）
		Smartphone Iphone7 = new Iphone();

		//LINE電話メソッドを呼び出し（例外処理発生）
		//Iphone7.tell(6255);

		//CPUをセットするメソッドを呼び出し
		Iphone7.inputAndSetCpu();

		//RAMをセット
		Iphone7.inputAndSetRam();

		//ROMをセット
		Iphone7.inputAndSetRom();

		//音楽DLメソッドをオーバーライド
		Iphone7.music();

		//LINE電話メソッドを呼び出し
		Iphone7.tell(6255);



		//Androidインスタンスを生成（同時にOSを設定し、名前を入力する）
		Smartphone Galaxy = new Android();

		//CPU情報をセット
		Galaxy.inputAndSetCpu();

		//RAMをセット
		Galaxy.inputAndSetRam();

		//ROMをセット
		//Galaxy.inputAndSetRom();

		//音楽DLメソッドをオーバーライド（ROMをセットしていないので例外発生）
		Galaxy.music();

		//音声通話メソッドを呼び出し
		Galaxy.tell(80, "090-1234-5678");

	}

	catch (CheckException e) {
		e.printStackTrace();
	}

	}


}
