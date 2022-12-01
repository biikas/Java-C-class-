package day4;

public class Pattern {
	
	/**
	 * 6
	 * 66
	 * 666
	 * 6666
	 * 66666
	 * 
	 * 	 */

	public static void main(String[] args) {
		int a =6;
		for (int i=1;i<=5;i++) {
			for(int j =0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println("");
		}
		
	}
}
