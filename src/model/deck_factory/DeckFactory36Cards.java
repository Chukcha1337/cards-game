package model.deck_factory;

import model.card.Card;
import model.card.Rank;
import model.card.Suit;
import model.deck.Deck;

public class DeckFactory36Cards implements DeckFactory {

    @Override
    public Deck get() {
        Deck deck = new Deck();
        for (Suit suit : Suit.values()) {
            for (int i = Rank.SIX.ordinal(); i <= Rank.KING.ordinal(); i++) {
                Rank rank = Rank.values()[i];
                Card card = new Card(rank, suit);
                deck.add(card);
            }
            Card ace = new Card(Rank.ACE, suit);
            deck.add(ace);
        }
        return deck;
    }
}
