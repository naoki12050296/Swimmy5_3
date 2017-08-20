package swimmy4;

public class SwimmyStudy4_2 {

	public static void main(String[] args) {
		try {

			//鈴木さんを人事部のインスタンスとして生成
			//（Employeeクラスに格納する）
			Employee Suzuki = new Jinji("鈴木",22);
			Suzuki.OutputEmployeeInfo();

			//山田さんを総務のインスタンスとして生成
			//（Soumuクラスに格納する）
			Soumu yamada = new Soumu("山田",18);
			yamada.OutputEmployeeInfo();

			//田中さんを人事部のインスタンスとして生成
			//コンストラクタは空指定
			//人事クラスに型へ格納
			Jinji tanaka = new Jinji();

			//年齢を14歳に設定する（中学生なので例外発生）
			tanaka.SetOld(14);

		}
		catch(IllegalArgumentException error) {
			System.out.println(error);
		}

	}

}
