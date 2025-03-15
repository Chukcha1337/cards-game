package model.deck_factory;

import model.deck.Deck;

import java.util.function.Supplier;

public interface DeckFactory extends Supplier<Deck> {

    @Override
    Deck get();
}
