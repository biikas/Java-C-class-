package constructorOverloading;

public class Shape {
	
	
	int length;
	int breadth;
	int height;
	int radius;
	String name;
	
	public Shape(int l,int b) {
		this.length=l;
		this.breadth=b;
	}
	
	public Shape(int r) {
		this.radius=r;
	}
	
	public Shape(int l , int b , int h) {
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
	
	public Shape(String name) {
		this.name=name;
	}
	

	public static void main(String[] args) {
		Shape bikas = new Shape(5);
		Shape ram = new Shape("Sphere","ram");
	}
}
