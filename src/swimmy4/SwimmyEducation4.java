package swimmy4;

public class SwimmyEducation4 {

	public static void main(String[] args) {

		try {
			//車クラスを生成する
			Car volvo = new Car("ボルボ");

			//名前と車種を出力する（Vehicleのメソッドが呼び出しされる）
			//派生クラスでメソッドが定義されていない場合は基底クラスが呼び出しされる
			volvo.OutputVehicleKind();

			//車を走らせる
			//(派生クラスと基底クラス両方でメソッドが定義されている場合は、派生クラスが呼び出しされる
			//オーバーライドされる
			volvo.RunningCar();

			//車を5km走らせる
			//(同一のメソッド名が定義されており引数違いのものは、同一の引数のメソッドがコールされること)
			//オーバーライド&オーバーロード
			volvo.RunningCar(5);

			//ボルボでバイクを走らせる(不可能)
			//派生クラスで定義されていない内容は、基底クラスでコールされる
			//この場合だと呼び出しても何も起こらない
			volvo.RunningBike();


			//ボルボを0km走らせる
			//throwされた内容は、catchで同一定義しているエラーインスタンスにてキャッチされる
			volvo.RunningCar(0);
	}
		catch(IllegalArgumentException e ) {
			System.out.println(e);
			}
		//派生クラスCarのインスタンスを基底クラスVehicleのtoyotaに格納
		Vehicle toyota = new Car("toyota");
		toyota.OutputVehicleKind();
		toyota.RunningCar(5);
		toyota.RunningCar();
		}
}
