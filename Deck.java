import java.util.*;

class Deck {
	
	ArrayList<Card> deck;
	
	// default constructor
	public Deck() {
		
		this.deck = new ArrayList<>();
	}
	
	// (a) method to create a new deck of cards
	public void createDeck() {
		
		// array of ranks
		String[] ranks = {
			"2","3","4","5","6",
			"7","8","9","10",
			"Jack","Queen","King","Ace"
		};
		
		// array of suits
		String[] suits = {"Clubs","Diamonds","Spades","Hearts"};
		
		// combinations of ranks and suits
		for(String rank : ranks) {
			for(String suit : suits) {
				deck.add(new Card(rank, suit));
			}
		}
	}
	
