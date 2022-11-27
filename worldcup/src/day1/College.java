package day1;


class College {
	
	void payFee() {
		System.out.println("Fee paid");
	}
	
	void play() {
		System.out.println("Playing");
	}
	
	void teach() {
		System.out.println("Teacher is teaching");
	}

	public static void main(String args[]) {
		
		College mayank = new College();
		College rajan = new College();
		College bikas = new College();
		
		mayank.play();
		bikas.teach();
		rajan.payFee();
		bikas.play();
		bikas.play();
		
	}
}
