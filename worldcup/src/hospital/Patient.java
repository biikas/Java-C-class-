package hospital;

public class Patient {
	
	public final static String HOSPITAL_NAME ="Bikas Hospital";
	PatientService patientService;
	
	int id;
	String name;
	String address;
	String phoneNumber;
	String admittedCase;
	
	Patient(int id, String name, String address, String phoneNumber, String admittedCase){
		this.id=id;
		this.name=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.admittedCase=admittedCase;
	}
	
	public static void main(String[] args) {
		Patient ram = new Patient(1,"Ram","Biratnagar","981430192","Accident");	
		PatientServiceImpl obj1 = new PatientServiceImpl();
		obj1.admit(ram.name, ram.admittedCase);
		obj1.checkUp(ram.name, ram.admittedCase);
		System.out.println(Patient.HOSPITAL_NAME);
	}
}
