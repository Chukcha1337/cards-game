import model.Game;
import model.card.Card;
import model.card.Rank;
import model.card.Suit;
import model.deck.Deck;
import model.deck_factory.DeckFactory;
import model.deck_factory.DeckFactory36Cards;
import model.deck_factory.DeckFactory52Cards;
import model.renderer.CardRenderer;
import model.renderer.ColorCardRenderer;
import model.renderer.PictureCardRenderer;
import model.renderer.TextCardRenderer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main2 {
    public static void main(String[] args) {
        DeckFactory factory = new DeckFactory36Cards();
        Deck deck = factory.get();

        CardRenderer cardRenderer = new TextCardRenderer();
        CardRenderer renderer = new ColorCardRenderer(cardRenderer);

        Game game = new Game(deck, renderer);
        game.start();
    }
}