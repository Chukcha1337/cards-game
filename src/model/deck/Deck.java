package model.deck;

import model.card.Card;

import java.util.*;

public class Deck {

    private final List<Card> cards = new ArrayList<>();

    public Deck() {
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void add(Deck deck) {
        cards.addAll(deck.cards);
    }

    public Card take() {
        return cards.removeLast();
    }

    public int size() {
        return cards.size();
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public List<Card> toList() {
        return new ArrayList<>(cards);
    }
}
