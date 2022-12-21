package encapsulations;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private String mobileNumber;
	public static final String SCHOOLS_NAME="St. Xaviers";
	
	public Student(int id, String name, String address, String mobileNumber) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
