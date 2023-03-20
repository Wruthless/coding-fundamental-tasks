import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PlayingCard {

    PlayingCard(Suite suite, Face face) {
        this.face = face;
        this.suite = suite;
    }

    public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};

    public static enum Suite {Clubs, Diamonds, Hearts, Spades};

    private final Face face;
    private final Suite suite;

    @Override
    public String toString() {
        return "suite=" + suite + ", face=" + face;
    }
}

public class ShufflePlayingCards {

    List<PlayingCard> list;

    public ShufflePlayingCards() {
        PlayingCard[] deck = new PlayingCard[52];
        int count = 0;

        for (PlayingCard.Suite suite: PlayingCard.Suite.values()) {
            for (PlayingCard.Face face: PlayingCard.Face.values()) {
                deck[count] = new PlayingCard(suite, face);
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
        ShufflePlayingCards shufflePlayingCards = new ShufflePlayingCards();
        shufflePlayingCards.printCards();
    }
}
