package pkgCore;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class DeckTest {

	@Test
	public void TestEmptyDeck() {
	//TODO: Build a deck, draw until you get a DeckException
		
	}
		
	
	@Test
	public void TestDrawSuit() {
		//TODO: Build a deck, test the Draw(eSuit) method
		Deck d= new Deck();
		Card c= d.Draw(pkgEnum.eSuit.HEARTS);
		assertTrue(c.geteSuit()==pkgEnum.eSuit.HEARTS);
	}
	
	@Test
	public void TestDrawRank() {
		//TODO: Build a deck, test the Draw(eRank) method
		Deck x = new Deck();
		Card c= x.Draw(pkgEnum.eRank.TWO);
		assertTrue(c.geteRank()== pkgEnum.eRank.TWO);

	}
	
	public void TestDeckRankCount() {
		//TODO: Build a deck, test the DeckRankCount method
		Deck d = new Deck();
		assertEquals(d.RCount(pkgEnum.eRank.TWO), 4);
	}
	
	public void TestDeckSuitCount() {
		//TODO: Build a deck, test the DeckSuitCount method
		Deck d = new Deck();
		assertEquals(d.SCount(pkgEnum.eSuit.HEARTS), 13);
	}

}
