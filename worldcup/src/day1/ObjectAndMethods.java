package day1;

class ObjectAndMethods {
	
	//methods
	//1.access modifiers -public , private , protected , default
	//2.return type void
	
	 void sum() {
		System.out.print(2+3);
	}
	
	public static void main(String[] args) {
		//creating an object
		ObjectAndMethods test =new ObjectAndMethods();
		test.sum();
	}

}
