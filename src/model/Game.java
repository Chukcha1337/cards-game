package model;

import dialogs.Dialog;
import dialogs.StringSelectDialog;
import model.card.Card;
import model.card.Suit;
import model.deck.Deck;
import model.renderer.CardRenderer;

import java.util.List;

public class Game {

    private static final String KEY_BLACK = "b";
    private static final String KEY_RED = "r";
    private final Deck deck;
    private final CardRenderer renderer;
    private int score;
    private final int startCardsAmount;

    public Game(Deck deck, CardRenderer renderer) {
        this.deck = deck;
        this.renderer = renderer;
        startCardsAmount = deck.size();
    }

    public void start() {
        deck.shuffle();
        System.out.println("ИГРА УГАДАЙ КАРТУ");
        System.out.println("-----------------");
        String title = "Угадайте карту ('%s' - черная, '%s' - красная)".formatted(KEY_BLACK, KEY_RED);
        String error = "Некорректный ввод";
        List<String> keys = List.of(KEY_BLACK, KEY_RED);
        Dialog<String> dialog = new StringSelectDialog(title, error, keys);
        while (!deck.isEmpty()) {
            System.out.printf("Количество карт в колоде: %d %n", deck.size());
            System.out.printf("Угадано: %d %n", score);
            String bet = dialog.input().toLowerCase();

            Card currentCard = deck.take();
            renderer.show(currentCard);
            if (isWin(bet, currentCard)) {
                score++;
                showWinMessage();
            } else {
                showLoseMessage();
            }
        }
        System.out.printf("Вы угадали %s из %s карт %n", score, startCardsAmount);
        System.out.println("В колоде закончились карты");
    }

    private void showWinMessage() {
        System.out.println("ВЫ УГАДАЛИ!");
    }

    private void showLoseMessage() {
        System.out.println("Вы не угадали.");
    }

    private boolean isWin(String bet, Card card) {
        if (bet.equals(KEY_RED)) {
            return isRed(card.getSuit());
        }
        return isBlack(card.getSuit());
    }

    private boolean isRed(Suit suit) {
        return !isBlack(suit);
    }

    private boolean isBlack(Suit suit) {
        return suit == Suit.CLUBS || suit == Suit.SPADES;
    }
}
