package model.cards_with_jokers;

public class RegularCard extends Card {

    private final Rank rank;
    private final Suit suit;

    public RegularCard(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
