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
	
	public void insertCassette(Cassette cassette) {
		this.cassette = cassette;
		hasCassette = true;
	}
	
	public void removeCassette() {
		cassette = null;
		hasCassette = false;
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
