# Assignment 4

## Deck of Cards
This Java program simulates a deck of 52 playing cards, allowing users to perform various operations such as creating a deck, printing cards, comparing cards, finding specific cards, shuffling, and dealing cards.

## Features

- **Create Deck**: Initializes a standard deck of 52 playing cards with four suits (Clubs, Diamonds, Spades, Hearts) and thirteen ranks (2 to Ace).
- **Print Deck**: Displays all cards in the deck.
- **Print a Specific Card**: Retrieves and prints a card at a given position.
- **Check Same Suit**: Determines if two selected cards belong to the same suit.
- **Compare Two Cards**: Checks if two selected cards have the same rank.
- **Find a Card**: Searches for a specific card (by rank and suit) and prints its position.
- **Deal 5 Random Cards**: Selects five random cards and removes them from the deck.
- **Shuffle Deck**: Randomizes the order of cards in the deck.

## Class Structure

### `Card.java`
- Represents a playing card with `rank` and `suit` attributes.
- Implements a `toString()` method for easy display.

### `Deck.java`
- Maintains an `ArrayList<Card>` representing the deck.
- Provides methods to create, print, shuffle, compare, and find cards.

### `Main.java`
- Implements the main menu-driven interface for user interaction.
- Calls appropriate methods from the `Deck` class.
