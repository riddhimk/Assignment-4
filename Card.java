class Card {
	
	// Card attributes
	String rank;
	String suit;
	
	// parameterized contructor
	public Card(String rank, String suit) {
		
		this.rank = rank;
		this.suit = suit;
	}
	
	// method to display rank and suit of a card
	public String toString() {
		return rank+" of "+suit;
	}
}