import model.deck.Deck;
import model.deck_factory.DeckFactory;
import model.deck_factory.DeckFactory36Cards;
import renderer.CardRenderer;
import renderer.ColorCardRenderer;
import renderer.TextCardRenderer;

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