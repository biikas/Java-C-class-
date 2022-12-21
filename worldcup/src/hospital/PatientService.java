package hospital;

public interface PatientService {
	
	public void admit(String name,String admittedCase);
	
	public void checkUp(String name, String admittedCase);
	
	public void discharge(String name,String phoneNumber);
}
