package day4;

public class ConditionalStatements {
	/**
	 * if statements
	 * if (condition){
	 * lines of code
	 * }
	 * <  >  
	 * <=
	 * >=
	 * ==
	 * >18 vote
	 * =18 okay
	 * <18 n0
	 */

	 
	public static void main(String[] args) {
		int age =18;
		if(age>18) {
			System.out.println("vote");
		} else if(age==19) {
			System.out.println("Okay");
		} else if(age <18) {
			System.out.println("No");
		}else {
			System.out.println("Wrong age");
		}
		
	}
}
