package swimmypractice5_advance;

public class ad_Iphone extends ad_Smartphone{

	//コンストラクタ１
		public ad_Iphone() {
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

				//RAMを選択させてセットするメソッド
				public ad_Smartphone setRamInfo() {
					System.out.println("RAM情報をセットします");
					System.out.println("0:4MB 1:8MB から選択してください");

					int inputNo = InputStreamNumber();

					if(inputNo == 0) {
						setRam(4);
						System.out.println("RAMに4MBがセットされました");
						}

					else if(inputNo == 1){
						setRam(8);
						System.out.println("ROMに8MBがセットされました");
						}
					else {
						System.out.println("RAMは未設定です");
						}
					return null;
				}
				//RAMを選択させてセットするメソッド
				public ad_Smartphone setRomInfo() {
					System.out.println("ROM情報をセットします");
					System.out.println("0:4MB 1:8MB から選択してください");

					int inputNo = InputStreamNumber();

					if(inputNo == 0) {
						setRom(4);
						System.out.println("RAMに4MBがセットされました");
						}

					else if(inputNo == 1){
						setRom(8);
						System.out.println("ROMに8MBがセットされました");
						}
					else {
						System.out.println("ROMは未設定です");
						}
					return null;
				}


		//音楽DLメソッド（例外チェック込み）
		public void music() throws Exception {
			ad_Check check = new ad_Check();
			check.less1(getOs());
			check.less2(getCpu());
			check.less3(getRam());
			check.less4(getRom());

			System.out.println("Itunesでダウンロードしました");
		}
	}


