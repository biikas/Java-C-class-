package String;

public class StringMethods {
	
	public static void main(String[] args) {
		
		/**
		 * equals
		 * equalsIgnoreCase
		 * bikash shah
		 * db:Bikash Shah
		 * Why string object is immutable ?
		 * when a string object is changed the value is not change instead a new object is created.
		 * string constant pool, heap memory, imutablity
		 */
		String address ="birat";
		address=address.concat("nagar");
		System.out.println(address);
	}
}
