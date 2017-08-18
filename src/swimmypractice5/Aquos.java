package swimmypractice5;

public class Aquos extends Android{

	public Aquos() {

	}

	public void sendMail() throws CheckException{
		this.check();
		System.out.println(this.Name+"のAquosから送信します");
	}
}
