package hospital;

public class PatientServiceImpl implements PatientService{

	@Override
	public void admit(String name, String admittedCase) {
		System.out.println("Patient name with "+name+ " is admitted for "+admittedCase);
		
	}

	@Override
	public void checkUp(String name, String admittedCase) {
		System.out.println("We are checking patinet with name "+name + "for "+admittedCase);
		
	}

	@Override
	public void discharge(String name, String phoneNumber) {
		System.out.println("Descharging "+name +"with phone number: "+phoneNumber);
	}
	
	public static void main(String[] args) {		
		Patient ram = new Patient(1,"Ram","Biratnagar","981430192","Accident");	
		PatientServiceImpl obj1 = new PatientServiceImpl();
		obj1.admit(ram.name, ram.admittedCase);
	}


}
