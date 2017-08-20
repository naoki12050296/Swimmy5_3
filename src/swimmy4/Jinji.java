package swimmy4;

public class Jinji extends Employee{

	//コンストラクタ
	public Jinji(String aName,int iOld) {
		//基底クラスをコールする
		super(aName,iOld);
	}

	//コンストラクタ２
	public Jinji() {

	}

	//所属部署を取得
	public void OutputEmployeeInfo() {
		System.out.println("人事部所属");
		System.out.println("名前は"+Name);
		System.out.println("年齢は"+iOld);
	}
}
