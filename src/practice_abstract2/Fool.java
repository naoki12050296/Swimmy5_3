package practice_abstract2;

public class Fool extends Character implements Human{

	public void attack() {
		System.out.println(this.getName()+"は攻撃した");
	}

	public void run() {
		System.out.println(this.getName()+"は逃げ出した");
	}

	public void talk() {
		System.out.println(this.getName()+"は喋り始めた");
	}

	public void watch() {
		System.out.println(this.getName()+"は見ている");
	}

	public void hear() {
		System.out.println(this.getName()+"は聞いている");
	}

}
