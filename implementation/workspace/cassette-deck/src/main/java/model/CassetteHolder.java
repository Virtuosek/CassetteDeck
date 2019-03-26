package model;

public class CassetteHolder {

	private boolean isOpen;
	private boolean hasCassette;
	private Cassette cassette;
	
	public CassetteHolder() {
		isOpen = false;
		hasCassette = false;
	}
	
	public void open() {
		isOpen = true;
	}
	
	public void close() {
		isOpen = false;
	}
	
	public boolean putCassette(Cassette cassette) {
		if(isOpen() && !hasCassette) {
			this.cassette = cassette;
			hasCassette = true;
			return true;
		}
		return false;
	}
	
	public boolean removeCassette() {
		if(isOpen() && hasCassette) {
			cassette = null;
			hasCassette = false;
			return true;
		}
		return false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public boolean hasCassette() {
		return hasCassette;
	}

	public Cassette getCassette() {
		return cassette;
	}
}
