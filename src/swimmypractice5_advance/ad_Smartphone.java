package swimmypractice5_advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ad_Smartphone {

	//OS情報を定義
	public static enum SmartphoneKind{iOS , Android};

	protected SmartphoneKind Os;
	protected String Cpu;
	protected int Ram;
	protected int Rom;

	//コンストラクタ１
	public ad_Smartphone() {
	}

	//実際にOSをセットするメソッド
	public void setOsIos(SmartphoneKind iOS) {
		SmartphoneKind Os = iOS;
		System.out.println("OS"+Os+"がセットされました");
		}
	public void setOsAndroid(SmartphoneKind Android) {
		SmartphoneKind Os = Android;
		System.out.println("OS"+Os+"がセットされました");
		}

	//OS情報のgetterメソッド
		public SmartphoneKind getOs () {
			return Os;
		}

	//実際にCPUをセットするメソッド
		public void setCpu(String aCpu) {
			String Cpu = aCpu;
			System.out.println("CPU"+Cpu+"がセットされました");
		}

	//CPU情報のgetterメソッド
		public String getCpu () {
			return Cpu;
		}

	//実際にRAMをセットするメソッド
		public void setRam(int aRam) {
			int Ram = aRam;
			System.out.println("CPU"+Ram+"がセットされました");
		}

	//CPU情報のgetterメソッド
		public int getRam () {
			return Ram;
		}

	//実際にRAMをセットするメソッド
		public void setRom(int aRom) {
			int Rom = aRom;
			System.out.println("CPU"+Rom+"がセットされました");
		}

	//CPU情報のgetterメソッド
		public int getRom () {
			return Rom;
		}
	//OSを選択させてセットするメソッド
	public ad_Smartphone setOsInfo() {
		System.out.println("OSをセットします");
		System.out.println("0:iOS(iPhone用) 1:Android(Android用)を選択してください");

		int inputNo = InputStreamNumber();

		ad_Smartphone choicePhone = null;

		if(inputNo == 0) {
			choicePhone = new ad_Iphone();
			choicePhone.setOsIos(SmartphoneKind.iOS);
			System.out.println("ようこそ、Iphoneを始めましょう");
			return choicePhone;
			}

		else if(inputNo == 1){
			choicePhone = new ad_Android();
			choicePhone.setOsAndroid(SmartphoneKind.Android);
			System.out.println("ようこそ、Androidを始めましょう");
			return choicePhone;
			}
		else {
			System.out.println("OS情報が不正です");
			return null;
		}

	}

	public ad_Smartphone setCpuInfo() {
		return null;
	}
	public ad_Smartphone setRamInfo() {
		return null;
	}
	public ad_Smartphone setRomInfo() {
		return null;
	}

	//音楽DLするメソッド（何もしない）
	public void music() throws Exception {

	}

	//音声通話のメソッド（例外チェック込み）
	public void tell(int countrycode,String phonenumber) throws Exception {
		ad_Check check = new ad_Check();
		check.less1(getOs());
		check.less2(getCpu());
		check.less3(getRam());
		check.less4(getRom());

		System.out.println(phonenumber + "の電話を呼び出しています");
		}

	//LINE電話のメソッド（例外チェック込み）
	public void tell(int lineid) throws Exception{
		ad_Check check = new ad_Check();
		check.less1(getOs());
		check.less2(getCpu());
		check.less3(getRam());
		check.less4(getRom());

		System.out.println(lineid + "のLINEを呼び出します");
		}


	public int InputStreamNumber() {
		String str;
		int ret = 0;
		try {
			InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);

			str = br.readLine();
			ret = Integer.valueOf(str).intValue();
	}
		catch(IOException e) {
			System.out.println(e);
		}
		return ret;
		}




}


