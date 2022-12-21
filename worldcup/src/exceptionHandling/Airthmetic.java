package exceptionHandling;

public class Airthmetic {
	
	public static int divide() {
		try {
			return 6/2;
		}catch(Exception exception) {
			System.out.println("Oops there is a eroor");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Answer is: "+Airthmetic.divide());
		System.out.println("My name is Bikash Shah.");
		
	
	}
}
