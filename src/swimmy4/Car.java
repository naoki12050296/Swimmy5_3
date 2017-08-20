package swimmy4;

 //車両クラスを継承し車クラスを作成
 //（継承する場合は必ずextendsと記載すること）
public class Car extends Vehicle {


	public Car() {
	}

	//コンストラクタ（１）
	public Car( String aName) {
		//Memo　引数指定されているコンストラクタが呼び出しされたら、Superメソッドを呼び出しする
		super( EVehicleKind.ECar,aName);
	}

	//車を走らせる（文字列が出力されるのみ）*走行距離も出力される
	public void RunningCar(int aKm) {

		//走行距離が0km以下の場合
		if( aKm <= 0) {

			//呼び出し元へ例外処理を投げる
			throw new IllegalArgumentException("引数の設定が不正です");

		}
		System.out.println("車である"+Name+"が"+aKm+"キロメートル走り出しました");
	}
}
