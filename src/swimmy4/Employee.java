package swimmy4;

public class Employee {

	protected String Name; //名前（派生クラスでもアクセス可能）
	protected int iOld;    //年齢（派生クラスでもアクセス可能）

	public Employee() {

	}

	public Employee(String name , int aOld) {

		//名前の文字列長が0の場合
		if(name.length() == 0) {
			throw new IllegalArgumentException("名前設定が不正です");
		}

		if(aOld < 15) {
			throw new IllegalArgumentException("年齢設定が不正です");
		}

		//メンバー設定へ設定
		Name = name;
		iOld = aOld;
	}

	//名前を設定する
	public void SetName(String name) {
		//名前の文字列長が0の場合
		if(name.length() == 0) {
			throw new IllegalArgumentException("名前設定が不正です");
		}
		Name = name;
	}

	//年齢を設定する
	public void SetOld(int aOld) {

		//年齢が15歳未満の場合
		if(aOld < 15) {
			throw new IllegalArgumentException("年齢設定が不正です");
		}
		iOld = aOld;
	}

	//所属部署を取得
	public void OutputEmployeeInfo() {

	}
}
