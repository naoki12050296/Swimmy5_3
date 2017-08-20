package swimmy4;

public class Vehicle {

	//Enum型で定数を定義する
	public static enum EVehicleKind{ECar , EBike};


	//派生クラスでも利用可
	protected String Name;
	protected EVehicleKind eKind;

	//基底クラス（１）
	public Vehicle() {
		}

	//基底クラス（２）
public Vehicle( EVehicleKind aKind,String aName) {
		//名前の設定が何もない場合
		if(aName.length() == 0) {

			//memo(1)IllegalArgumentExceptionのインスタンスを生成し、
			//上位クラスへ投げる（呼び出し元でキャッチされる）
			throw new IllegalArgumentException("名前の設定が不正です");

		}
			this.Name = aName;
			this.eKind = aKind;
	}
		//名前をセットする
		public void SetName( String aName) {
			this.Name = aName;
		}
		//種別をセットする
		public void SetKind(EVehicleKind aKind) {
			this.eKind = aKind;
					}
		//名前を取得するメソッド
		public String GetName() {
			return this.Name;
		}
		//乗り物種別を取得するメソッド
		public void OutputVehicleKind() {

			//乗り物種別がバイクの場合
			if(this.eKind == EVehicleKind.EBike) {
				System.out.println("乗り物の種別はバイクです");
			}
			//乗り物種別が車の場合
			else if(this.eKind == EVehicleKind.ECar) {
				System.out.println("乗り物種別は車です");
			}
			else {
				//何もしない
			}
		}
		//オーバーライド用のメソッド（車）
		public void RunningCar() {

		}
		//オーバーライド用のメソッド（車）
		public void RunningCar(int km) {

		}
		//オーバーライド用のメソッド（バイク）
		public void RunningBike() {

		}
		//オーバーライド用のメソッド（バイク）
		public void RunningBike(int km) {

		}
	}

