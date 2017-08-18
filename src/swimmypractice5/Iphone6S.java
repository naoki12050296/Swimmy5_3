package swimmypractice5;

public class Iphone6S extends Iphone{

	public Iphone6S() {

	}

	public void sendMail() throws CheckException{
		this.check();
		System.out.println(this.Name+"のIphone6Sから送信しました");
	}

}
