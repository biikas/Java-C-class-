package Wrestling;

public class Reymesterio implements WrestlingService{

	@Override
	public String punch() {
		// TODO Auto-generated method stub
		return "punch";
	}

	@Override
	public String kick(String power) {
		// TODO Auto-generated method stub
		return "power"+power;
	}

}
