import model.card.Card;
import model.card.Rank;
import model.card.Suit;
import model.deck.Deck;
import renderer.CardRenderer;
import renderer.ColorCardRenderer;
import renderer.PictureCardRenderer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.SIX, Suit.CLUBS);
        Card card2 = new Card(Rank.NINE, Suit.HEARTS);
        Card card3 = new Card(Rank.QUEEN, Suit.SPADES);

        Deck deck = new Deck();
        deck.add(card1);
        deck.add(card2);
        deck.add(card3);

        CardRenderer cardRenderer = new PictureCardRenderer();
        CardRenderer renderer = new ColorCardRenderer(cardRenderer);

        Game game = new Game(deck, renderer);
        game.start();
    }
}