package swimmypractice5;

public class Nexus extends Android{

	public Nexus() {

	}

	public void sendMail() throws CheckException {
		this.check();
		System.out.println(this.Name+"のNexusから送信します");
	}
}



