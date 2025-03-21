package renderer;


import model.card.Card;

public class PictureCardRenderer implements CardRenderer {
    private static final String[][] REGULAR_CARD_PICTURES =
            {
                    {
                            "┌─────────┐",
                            "│A$  @    │",
                            "│  __│__  │",
                            "│   │ │   │",
                            "│   │ │   │",
                            "│    V  $A│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│2        │",
                            "│    $    │",
                            "│         │",
                            "│    $    │",
                            "│        3│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│3        │",
                            "│    $    │",
                            "│    $    │",
                            "│    $    │",
                            "│        3│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│4        │",
                            "│  $   $  │",
                            "│         │",
                            "│  $   $  │",
                            "│        4│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│5        │",
                            "│  $   $  │",
                            "│    $    │",
                            "│  $   $  │",
                            "│        5│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│6        │",
                            "│  $ $ $  │",
                            "│         │",
                            "│  $ $ $  │",
                            "│        6│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│7        │",
                            "│  $ $ $  │",
                            "│    $    │",
                            "│  $ $ $  │",
                            "│        7│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│8        │",
                            "│  $ $ $  │",
                            "│   $ $   │",
                            "│  $ $ $  │",
                            "│        8│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│9        │",
                            "│  $ $ $  │",
                            "│  $ $ $  │",
                            "│  $ $ $  │",
                            "│        9│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│10  $    │",
                            "│  $ $ $  │",
                            "│  $   $  │",
                            "│  $ $ $  │",
                            "│    $  10│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│J$ ~~~~  │",
                            "│   |0 B  │",
                            "│  /.  |  │",
                            "│   |_/|  │",
                            "│       $J│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│Q$ ////  │",
                            "│ *(`o`)* │",
                            "│    #    │",
                            "│-(.)(.)- │",
                            "│       $Q│",
                            "└─────────┘",
                    },
                    {
                            "┌─────────┐",
                            "│K$       │",
                            "│  WWWW   │",
                            "│ |öLö B  │",
                            "│ | - /   │",
                            "│  vvv  $K│",
                            "└─────────┘",
                    }
            };

    @Override
    public void show(Card card) {
        int index = card.getRank().ordinal();

        String[] picture = REGULAR_CARD_PICTURES[index].clone();
        String textSuit = card.getSuit().getSymbol();

         for (String line : picture) {
             line = line.replace("$", textSuit);
             System.out.println(line);
        }
    }
}
