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

	// (d) method to check if 2 cards are from same suits
	public void sameCard(int pos1, int pos2) {

		if(pos1 < deck.size() && pos2 < deck.size()) {
			Card c1 = deck.get(pos1);
			Card c2 = deck.get(pos2);

			if(c1.suit.equals(c2.suit)) {
				System.out.println(c1 + " and " + c2 + " belong to same suit");
			}
			else {
				System.out.println(c1 + " and " + c2 + " belong to different suit");
			}
		}
		else {
			System.out.println("Invalid Position!");
		}
	}

	// (e) method to compare 2 cards on rank
	public void compareCards(int pos1, int pos2) {
		
		if(pos1 < deck.size() && pos2 < deck.size()) {
			Card c1 = deck.get(pos1);
			Card c2 = deck.get(pos2);

			if(c1.rank.equals(c2.rank)) {
				System.out.println(c1 + " and " + c2 + " have the same rank");
			}
			else {
				System.out.println(c1 + " and " + c2 + " have different ranks");
			}
		}
		else {
			System.out.println("Invalid Position!");
		}
	}

	// (f) method to find a particular card
	public void findCard(String rank, String suit) {

		for (int i = 0; i < deck.size(); i++) {
			Card card = deck.get(i);
			if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
				System.out.println("Card Found: " + card + " at position " + i);
				return;
			}
		}
		System.out.println("Card not found.");
	}

	// (g) method to deal 5 random cards
	public void dealCard() {

		// shuffle deck to randomize occurrence of cards
		shuffleDeck();
		
		// select cards
		System.out.println("-----SELECTED CARDS-----");
		for(int i = 0; i < 5; i++) {
			System.out.println((i+1) + ". " + deck.get(i));
		}

		// remove from the array list
		for(int i = 0; i < 5; i++) {
			deck.remove(0);
		}

		System.out.println("-----Cards removed-----");
	}
	
	// (h) method to shuffle the deck
	public void shuffleDeck() {
		
		System.out.println("-----Shuffling Deck-----");
		Collections.shuffle(deck);
	}
}