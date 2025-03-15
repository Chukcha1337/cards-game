package renderer;


import model.card.Card;
import model.card.Suit;

public class ColorCardRenderer implements CardRenderer {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";


    private final CardRenderer cardRenderer;

    public ColorCardRenderer(CardRenderer cardRenderer) {
        this.cardRenderer = cardRenderer;
    }

    @Override
    public void show(Card card) {
        Suit suit = card.getSuit();
        if (isBlack(suit)) {
            System.out.print(ANSI_GREEN);
        } else {
            System.out.print(ANSI_RED);
        }
        cardRenderer.show(card);
        System.out.print(ANSI_RESET);
    }

    private boolean isBlack(Suit suit) {
        return suit == Suit.CLUBS || suit == Suit.SPADES;
    }

}
