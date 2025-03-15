package model.cards_with_jokers;

public enum Suit {
    DIAMONDS("♦", CardColor.RED),
    HEARTS("♥", CardColor.RED),
    CLUBS("♣", CardColor.BLACK),
    SPADES("♠", CardColor.BLACK);

    private final String symbol;
    private final CardColor color;

    Suit(String symbol, CardColor color) {
        this.symbol = symbol;
        this.color = color;
    }

    public String getSymbol() {
        return symbol;
    }
    public CardColor getColor() { return color; }
}
