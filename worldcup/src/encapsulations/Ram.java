package encapsulations;

public class Ram {
	public static void main(String[] args) {
		Account acount = new Account();
		acount.setAmount(5000);
		System.out.println(acount.getAmount());
	}
}
