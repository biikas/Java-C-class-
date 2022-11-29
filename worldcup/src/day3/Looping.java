package day3;

public class Looping {
	
	/**
	 * 1.to print my name 5 times
	 * 2. for () {}
	 * 3. for ()
	 * 
	 * for (init;condition;increment/decrement)
	 * i++     i=i+1
	 * i--     i=i-1
	 *while(condition){lines of code}
	 */

	public static void main(String[] args) {
		
		int a =1;
		for (int i=0;i<5;i++) {
			System.out.println("Value : "+a);
		}
		
		boolean status = true;
		while(a<6) {
			System.out.println("Bikash ");
			a++;
		}
		

	}
}
