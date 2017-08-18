package swimmypractice5;

public class Iphone7plus extends Iphone{

	public Iphone7plus() {

	}

	public void sendMail() throws CheckException{
		this.check();
		System.out.println(this.Name+"のIphone7plusから送信しました");
	}

}
