package swimmypractice5_advance;

import swimmypractice5_advance.ad_Smartphone.SmartphoneKind;

public class ad_Check extends Exception{

	//OS情報の未定義チェック
	public void less1(SmartphoneKind Os) throws Exception{
		if(Os == null) {
			throw new Exception("OS情報が不正です");
			}
		}

	//CPU情報の未定義チェック
	public void less2(String Cpu) throws Exception{
		if(Cpu == null || Cpu.isEmpty()) {
			throw new Exception("CPU情報が不正です");
			}
		}

	//RAM情報の未定義チェック
	public void less3(int Ram) throws Exception{
		if(Ram == 0) {
			throw new Exception("RAM情報が不正です");
			}
		}

	//ROM情報の未定義チェック
	public void less4(int Rom) throws Exception{
		if(Rom == 0) {
			throw new Exception("ROM情報が不正です");
			}
		}
	}



