package day3;

public class Pattern {
	public static void main(String[] args) {
		char a = '*';
		for(int i=0;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(a);
			}
			System.out.println("");
		}
	}
}
