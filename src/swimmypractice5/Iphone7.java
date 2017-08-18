package swimmypractice5;

public class Iphone7 extends Iphone{

	public Iphone7() {
		
	}
	
	public void sendMail() throws CheckException{
		this.check();
		System.out.println(this.Name+"のIphone7から送信しました");
	}
}
