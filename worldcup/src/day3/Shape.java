package day3;

public class Shape {
	
	int calcAreaOfRectange(int length,int width) {
		return length * width;
	}
	
	int volume(int length, int width,int height) {
		return length* width* height;
	}
	public static void main(String[] args) {
		Shape rectangle = new Shape();
		int area = rectangle.calcAreaOfRectange(5, 6);
		System.out.println("The area is: "+area);
		
		Shape cuboid = new Shape();
		int volume= cuboid.volume(5, 6, 7);
		System.out.println("The vol is "+volume);
	}

}
