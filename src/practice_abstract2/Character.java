package practice_abstract2;

public abstract class Character {

	int hp;
	String name;

	public abstract void run();

	public abstract void attack();

	public String getName() {
		return this.name;
	}
}
