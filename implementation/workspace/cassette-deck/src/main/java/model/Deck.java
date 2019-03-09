package model;

public class Deck {

	private Motor motor;
	private PlayHead head;
	private CassetteHolder holder;
	private DeckController controller;
	
	public Deck() {
		this.motor = new Motor();
		this.head = new PlayHead();
		this.holder = new CassetteHolder();
		this.controller = new DeckController();
	}
}
