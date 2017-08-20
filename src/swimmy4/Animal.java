package swimmy4;

public class Animal {

	protected String Name;

	//コンストラクタ
	public Animal() {
	}
	//名前付きのコンストラクタ
	public Animal(String aName) {

		//名前の長さが0の場合
		if(aName.length() == 0) {

			//上位クラスへ投げる（呼び出し元でcatchされる）
			throw new IllegalArgumentException("引数の設定が不正です");
		}

		Name = aName;
	}

	//名前を変える
	public void SetReName(String aName) {

		//名前の長さが0の場合
		if(aName.length() == 0) {

			//上位クラスへ投げる（呼び出し元でcatchされる）
			throw new IllegalArgumentException("引数の設定が不正です");
		}
		Name = aName;
	}

	//肉を食べる
	public void EatMeat() {
		}
	//肉を食べる
	public void EatMeat(String aMeatName) {
		}
	//植物を食べる
	public void EatPlant() {
		}
	//植物を食べる
	public void EatPlant(String aPlantName) {
		}
	//鳴く
	public void bark() {
		}
	}
