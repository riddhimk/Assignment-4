import java.util.*;

class Main {
    
    public static void main(String args[]) {
        
        Deck deck = new Deck();
        Scanner scan = new Scanner(System.in);
        int choice;
        
        do {

			System.out.println("\n===== MENU =====");
			System.out.println("1. Create Deck");
			System.out.println("2. Print Deck");
			System.out.println("3. Print a Card");
			System.out.println("4. Check if Two Cards are of the Same Suit");
			System.out.println("5. Compare Two Cards (Same Rank)");
			System.out.println("6. Find a Card");
			System.out.println("7. Deal 5 Random Cards");
			System.out.println("8. Shuffle Deck");
			System.out.println("9. Exit");
			System.out.print("Enter your choice: ");
			choice = scan.nextInt();

			switch (choice) {

				case 1: {
					deck.createDeck();
					System.out.println("Deck created successfully.");
					break;
				}

				case 2: {
					deck.printDeck();
					break;
				}

				case 3: {
					System.out.print("Enter card index (0-51): ");
					int index = scan.nextInt();
					deck.printCard(index);
					break;
				}

