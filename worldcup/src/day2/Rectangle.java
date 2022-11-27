package day2;

public class Rectangle {
	
	int areaOfRectangle(int length,int width) {
		int area = length *width;
		return area;
	}
	
	int perimeterOfRectangle(int length,int width) {
		int perimeter = 2*(length+width);
		return perimeter;
	}
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		int perimeter =rec1.perimeterOfRectangle(5,6);
		System.out.println("Perimeter"+perimeter);
		int area =rec1.areaOfRectangle(6, 6);
		System.out.println("Area: "+area);

	}
}
