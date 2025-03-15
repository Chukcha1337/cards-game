package renderer;


import model.card.Card;

public class TextCardRenderer implements CardRenderer {

    private static final String[] RANK_NAMES = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    @Override
    public void show(Card card) {
     // "J♦"
        int index = card.getRank().ordinal();

        String textRank = RANK_NAMES[index];
        String textSuit = card.getSuit().getSymbol();

        System.out.println(textRank + textSuit);
    }
}
