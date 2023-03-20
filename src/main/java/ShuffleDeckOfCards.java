import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Card {

    Card(Face face, Suite suite) {
        this.face = face;
        this.suite = suite;
    }

    public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    ;

    public static enum Suite {Clubs, Diamonds, Hearts, Spades}

    ;

    private final Face face;
    private final Suite suite;

    public Face getFace() {
        return face;
    }

    public Suite getSuite() {
        return suite;
    }

    @Override
    public String toString() {
        return "face=" + face + ", suite=" + suite;
    }
}

public class ShuffleDeckOfCards {

    private List<Card> list;

    public ShuffleDeckOfCards() {
        Card[] deck = new Card[52];
        int count = 0;

        for (Card.Suite suite : Card.Suite.values()) {
            for (Card.Face face : Card.Face.values()) {
                deck[count] = new Card(face, suite);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void printCards() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%10s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

    public static void main(String[] args) {
        // ShuffleDeckOfCards cards = new ShuffleDeckOfCards();
        // cards.printCards();
        ShufflePlayingCards shufflePlayingCards = new ShufflePlayingCards();
        shufflePlayingCards.printCards();
    }
}
