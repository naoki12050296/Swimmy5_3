package swimmypractice5_advance;

public class ad_Android extends ad_Smartphone{


	//コンストラクタ１
	public void Android() {
	}


	//CPUを選択させてセットするメソッド
			public ad_Smartphone setCpuInfo() {
				System.out.println("CPUをセットします");
				System.out.println("0:サムスン製 1:TSMC製 から選択してください");

				int inputNo = InputStreamNumber();

				if(inputNo == 0) {
					setCpu("サムスン");
					System.out.println("CPUにサムスンがセットされました");
					}

				else if(inputNo == 1){
					setCpu("TSMC");
					System.out.println("CPUにTSMCがセットされました");
					}
				else {
					System.out.println("CPUは未設定です");
					}
				return null;
				}


	//音楽DLメソッド（例外チェック込み）
	public void music() throws Exception{
		ad_Check check = new ad_Check();
		check.less1(getOs());
		check.less2(getCpu());
		check.less3(getRam());
		check.less4(getRom());

		System.out.println("Google Play Musicでダウンロードしました");
	}


	}


