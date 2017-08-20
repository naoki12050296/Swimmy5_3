package swimmy4;

public class SwimmyStudy4_1 {

	public static void main(String[] args) {
		try {

			//名前付きのヤギの太郎を作成する
			Yagi taro = new Yagi("太郎");

			//太郎を泣かせてみる
			taro.bark();

			//太郎に試しに肉を食べさせてみる（無理）
			taro.EatMeat();

			//太郎に草を食べさせる
			taro.EatPlant();

			//ライオンクラスのインスタンスを作成
			Lion hanako = new Lion();

			//名前を花子にする
			hanako.SetReName("花子");

			//花子に草を食べさせる（無理）
			hanako.EatPlant();

			//花子を鳴かせる
			hanako.bark();

			//Animalクラスで次郎を作成する
			Animal jiro = new Lion("次郎");

			//次郎に肉を食べさせる
			jiro.EatMeat();

			//空文字指定を行うと例外処理が発生
			Yagi saburo = new Yagi("");
		}
		catch(IllegalArgumentException e ){
			System.out.println(e);
		}

	}

}
