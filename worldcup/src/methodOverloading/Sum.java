package methodOverloading;

public class Sum {

	
	int sum(int x, int y){
		return x+y;
	}
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	int sum(byte f, byte g) {
		return (f+g);
	}
	public static void main(String[] args) {
		Sum obj1 = new Sum();
		int total = obj1.sum(6, 7,8);
		System.out.println(total);
	}
}
