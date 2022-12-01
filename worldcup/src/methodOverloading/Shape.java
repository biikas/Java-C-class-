package methodOverloading;

public class Shape {
	int area(int l, int b){
		return l*b;
	}
	int area(int l) {
		return l*l;
	}
	int area(int l, int b, int h) {
		return 2*h*(l+b);
	}
	
	public static void main(String[] args) {
		Shape square = new Shape();
		int a1=square.area(5);
		Shape rectangle = new Shape();
		int a2= rectangle.area(6,4);
		Shape room = new Shape();
		int a3 =room.area(4,5,6);
		System.out.println(a1+a2+a3);
	}
}
