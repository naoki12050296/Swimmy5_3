package swimmy4;

public class Lion extends Animal{

	//コンストラクタ
	public Lion() {
		}
	//名前付きのコンストラクタ
	public Lion(String aName) {
		super(aName);
		}
	//肉を食べる
	public void EatMeat() {
		System.out.println("ライオンである"+Name+"は肉を食べます");
	}
	//肉を食べる
	public void EatMeat(String aMeatName) {
		System.out.println("ライオンである"+Name+"は"+aMeatName+"を食べます");
	}
	//植物を食べる
	public void EatPlant() {
		System.out.println("ライオンである"+Name+"は植物を食べられません");
	}
	//植物を食べる
	public void EatPlant(String aPlantName){
		System.out.println("ライオンである"+Name+"は"+aPlantName+"を食べられません");
	}
	//鳴く
	public void bark() {
		System.out.println("がおーん");
	}
}
