package model;

public class CassetteHolder {

	private Cassette cassette;
	private boolean isHolderOpen;
	
	public CassetteHolder() {
		this.isHolderOpen = false;
	}
	
	public void open() {
		this.isHolderOpen = true;
	}
	
	public void close() {
		this.isHolderOpen = false;
	}
	
	public void insertCassette(Cassette cassette) {
		this.cassette = cassette;
	}
	
	public void removeCassette() {
		cassette = null;
	}
}
