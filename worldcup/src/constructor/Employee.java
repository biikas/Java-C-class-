package constructor;

public class Employee {
	
	int empId;
	String employeeName;
	String address;
	long salary;
	String phoneNumber;
	long amount =1000l;
	

	
	public Employee(int empId,String employeeName,String address,Long salary, String phoneNumber) {
		this.empId=empId;
		this.employeeName=employeeName;
		this.address=address;
		this.salary=salary;
		this.phoneNumber=phoneNumber;
	}
	
	public static void main(String[] args) {
		Employee bikas = new Employee(1,"Bikas","Biratnagar",100000l,"9814301921");
		
		Employee ojha = new Employee(2,"Abhishek","Singapore",200000L,"123254545");
	}
}
