package model.deck_factory;

import model.card.Card;
import model.card.Rank;
import model.card.Suit;
import model.deck.Deck;

public class ShoesDeckFactory implements DeckFactory {

    private final DeckFactory deckFactory;
    private final int amount;

    public ShoesDeckFactory(DeckFactory deckFactory, int amount) {
        this.deckFactory = deckFactory;
        this.amount = amount;
    }

    @Override
    public Deck get() {
        Deck deck = new Deck();
        for (int i = 0; i < amount; i++) {
            deck.add(deckFactory.get());
        }
        return deck;
    }
}
