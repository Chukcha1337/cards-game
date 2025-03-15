package model.deck_factory;

import model.card.Card;
import model.card.Rank;
import model.card.Suit;
import model.deck.Deck;

public class DeckFactory52Cards implements DeckFactory {

    @Override
    public Deck get() {
        Deck deck = new Deck();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
        return deck;
    }
}
