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
	
	// (b) method to display created deck
	public void printDeck() {
		
		System.out.println("-----DECK-----");
		for(Card card : deck) {
			System.out.println(card);
		}
	}

	// (c) method to print card (by position)
	public void printCard(int pos) {

		if(pos >= 0 && pos < deck.size()) {
			System.out.println("Card at position " + pos + ": " + deck.get(pos));
		}
		else {
			System.out.println("Invalid Position!");
		}
	}

