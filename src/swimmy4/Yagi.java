package swimmy4;

public class Yagi extends Animal{

	//コンストラクタ
	public Yagi() {

	}
	//名前付きのコンストラクタ
	public Yagi(String aName) {
		super(aName);
	}

	//肉を食べる
	public void EatMeat() {
		System.out.println("ヤギである"+Name+"は肉を食べません");
	}
	//肉を食べる
	public void EatMeat(String aMeatName) {
		System.out.println("ヤギである"+Name+"は"+aMeatName+"を食べません");
	}
	//植物を食べる
	public void EatPlant() {
		System.out.println("ヤギである"+Name+"植物を食べます");
	}
	//植物を食べる
	public void EatPlant(String aPlantName) {
		System.out.println("ヤギである"+Name+"は"+aPlantName+"を食べます");
	}
	//鳴く
	public void bark() {
		System.out.println("め〜");
	}
}
