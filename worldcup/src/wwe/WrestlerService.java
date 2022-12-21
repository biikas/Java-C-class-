package wwe;

public abstract class WrestlerService {
	
	public String kick(String power) {
		return "power: "+power;
	}
	
	public String punch() {
		return "punch";
	}
	
	public abstract String entranceSong() ;
	//0 TO 100%
}
