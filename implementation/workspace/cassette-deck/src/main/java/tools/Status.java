package tools;

public enum Status {
	
	OFF("Off"),
	IDLE("Idle"),
	PLAYING("Playing"),
	FAST_FORWARDING("Fast forwarding"),
	FAST_REWINDING("Fast rewinding"),
	RECORDING("Recording");
	
	private String name;
	
	Status(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
