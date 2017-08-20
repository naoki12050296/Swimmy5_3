package swimmypractice5_advance;

public class ad_Main {

	public static void main(String[] args) {

		try {
		//入れ物となるスマートフォンを作成
		ad_Smartphone phone = new ad_Smartphone();

		//phoneにOSをセット
		phone.setOsInfo();

		//phoneにCPUをセット
		ad_Smartphone choicePhone = phone.setCpuInfo();

		choicePhone.setRamInfo();

		choicePhone.setRomInfo();

		choicePhone.music();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}

	}


