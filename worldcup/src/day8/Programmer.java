package day8;

public class Programmer extends Company{
	
	void bonus() {
		System.out.println("100,000");
	}
	public static void main(String[] args) {
		Programmer mayank = new Programmer();
		mayank.Salary();
		mayank.bonus();
		System.out.println(mayank.workingHours);
	}
}
