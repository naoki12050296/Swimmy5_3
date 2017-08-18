package swimmypractice5;

public class MobileShop {

		public MobileShop() {

		}


		//Androidの機種を選ぶメソッド
				public Iphone choiceIphone(){

					System.out.println("Iphoneの機種を選んでください");
					System.out.println("0:Iphone7 1:Iphone7plus 2:Iphone6S");
					int iphoneNo = new java.util.Scanner(System.in).nextInt();

					Iphone iphone;

						if(iphoneNo == 0) {
							 iphone = new Iphone7();
							System.out.println("iphone7を選択しました");
							return iphone;
						}else if(iphoneNo == 1) {
							iphone = new Iphone7plus();
							System.out.println("iphone7plusを選択しました");
							return iphone;
						}else if(iphoneNo == 2) {
							iphone  = new Iphone6S();
							System.out.println("iphone6Sを選択しました");
							return iphone;
						}else {
							System.out.println("もう一度入力してください");
							choiceIphone();
							return null;
						}

				}


	//Androidの機種を選ぶメソッド
		public Android choiceAndroid(){

			System.out.println("Androidの機種を選んでください");
			System.out.println("0:Nexus 1:Aquos 2:Xperia");
			int androidNo = new java.util.Scanner(System.in).nextInt();

			Android android;

				if(androidNo == 0) {
					 android = new Nexus();
					System.out.println("Nexusを選択しました");
					return android;
				}else if(androidNo == 1) {
					android = new Aquos();
					System.out.println("Aquosを選択しました");
					return android;
				}else if(androidNo == 2) {
					android  = new Xperia();
					System.out.println("Xperiaを選択しました");
					return android;
				}else {
					System.out.println("もう一度入力してください");
					choiceAndroid();
					return null;

				}

		}



}
