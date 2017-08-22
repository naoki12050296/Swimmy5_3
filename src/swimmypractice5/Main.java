package swimmypractice5;

public class Main {

	public static void main(String[] args) throws Exception {
		try {
			//携帯ショップのインスタンスを生成
			MobileShop shop = new MobileShop();

			//Iphoneの機種を選択し、名前を設定
			Iphone iphone = shop.choiceIphone();

			//CPUをセットするメソッドを呼び出し
			iphone.inputAndSetCpu();

			//RAMをセット
			iphone.inputAndSetRam();

			//ROMをセット
			iphone.inputAndSetRom();

			//選ばれた機種に応じたメールを送信する（ポリモーフィズム）
			iphone.sendMail();

			//音楽DLメソッドをオーバーライド
			iphone.music();

			//LINE電話メソッドを呼び出し
			iphone.tell(6255);

			//androidの機種を選択し、名前を設定
			Android android = shop.choiceAndroid();

			//CPU情報をセット
			android.inputAndSetCpu();

			//RAMをセット
			android.inputAndSetRam();

			//ROMをセット
			android.inputAndSetRom();

			//選ばれた機種に応じたメールを送信する（ポリモーフィズム）
			android.sendMail();

			//音楽DLメソッドをオーバーライド（ROMをセットしていないので例外発生）
			android.music();

			//音声通話メソッドを呼び出し
			android.tell(80, "090-1234-5678");
		}
        
        
        
        
        catch(CheckException e) {
			e.printStackTrace();
		}
	}
}
