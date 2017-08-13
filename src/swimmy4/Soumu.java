package swimmy4;

public class Soumu extends Employee{

	//コンストラクタ１
	public Soumu(String aName, int iOld) {
		//基底クラスをコールする
		super(aName,iOld);
	}

	//コンストラクタ２
	public Soumu() {

	}

	//所属部署を取得
	public void OutputEmployeeInfo() {
		System.out.println("総務所属");
		System.out.println("名前は"+Name);
		System.out.println("年齢は"+iOld);
	}

}
