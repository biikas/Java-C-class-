package exceptionHandling;

public class ArithmeticException2 {
	
	int a =10;
	int b=0;
	public void divide() {
		try {
		System.out.println("a divide by b=  "+this.a/this.b);
		}catch(Exception e) {
			System.out.println("Some errors");
//			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}
	
	public static void main(String[] args) {
		ArithmeticException2 object = new ArithmeticException2();
		object.divide();
	}
}
