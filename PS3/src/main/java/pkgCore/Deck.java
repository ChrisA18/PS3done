package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private ArrayList<Card> cardsInDeck;

	public Deck() {
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				cardsInDeck.add(new Card(eSuit, eRank));
			}
		}
		Collections.shuffle(cardsInDeck);
	}

	// Fix the Draw method so it throws an exception if the deck is empty
	public Card Draw() {
		try {
			return cardsInDeck.remove(0);
		}
		catch (Exception DeckException) {
			System.out.println("Deck Empty");
			throw DeckException;
		}
	}
	
	// Write an overloaded Draw method to Draw a card of a given eSuit
	public Card Draw(eSuit eSuit) {
		for(Card c: this.cardsInDeck){
			if (c.geteSuit() == eSuit) {
				cardsInDeck.remove(c);
				return c;
			}
	
		}
		return null;
	}
	
	
	// Write an overloaded Draw method to Draw a card of a given eRank
	public Card Draw(eRank eRank) {
		for(Card c: this.cardsInDeck) {
			if(c.geteRank() == eRank) {
				cardsInDeck.remove(c);
				return c;
			}
			
		}
		return null;
	}
		
	// Write a method that will return the number of a given eSuit left in the deck.
	public int SCount(eSuit eSuit) {
		int suitLeft = 0;
		for (Card c: cardsInDeck) {
			if(c.geteSuit() == eSuit)
				suitLeft++;
		}
		return suitLeft++;
		
	}
	
	// Write a method that will return the number of a given eRank left in the deck.
	public int RCount(eRank eRank) {
		int rankLeft = 0;
		for (Card c: cardsInDeck) {
			if(c.geteRank() == eRank)
				rankLeft++;
		}
		return rankLeft++;
	}
	
	// Write a method that will return 0 or 1 if a given card is left in the deck.
	public int cardsLeft(Card c) {
		for(Card cards:cardsInDeck){
			if(cards == c)
				return 1;
		}
		return 0;
	}
}
