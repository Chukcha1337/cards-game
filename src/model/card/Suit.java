package model.card;

public enum Suit {
    DIAMONDS("♦"), HEARTS("♥"), CLUBS("♣"), SPADES("♠");

    private String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
