package Wrestling;

public class Undertaker implements WrestlingService{

	@Override
	public String punch() {
		return "punch";
	}

	@Override
	public String kick(String power) {
		return "power"+power;
	}

}
