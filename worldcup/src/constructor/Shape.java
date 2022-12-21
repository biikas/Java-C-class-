package constructor;

public class Shape {
	
	
	int length;
	int breadth;
	int height;
	
	public Shape(int length,int breadth, int height) {
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}

	
	
	public static void main(String[] args) {
		Shape cuboid = new Shape(3,4,5);
		
	}
}
