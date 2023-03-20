import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class PlayingCard {
    PlayingCard(Face face, Suite suite) {
        this.suite = suite;
        this.face = face;
    }

    public static enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
    public static enum Suite {Clubs, Diamonds, Hearts, Spades};

    private final Suite suite;
    private final Face face;

    public Suite getSuite() {
        return suite;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public String toString() {
        return "face=" + face + "\tsuite=" + suite;
    }
}

class ShufflePlayingCards {

    List<PlayingCard> list;

    ShufflePlayingCards() {
        PlayingCard[] deck = new PlayingCard[52];
        int count = 0;

        for (PlayingCard.Suite suite: PlayingCard.Suite.values()) {
            for (PlayingCard.Face face: PlayingCard.Face.values()) {
                deck[count] = new PlayingCard(face, suite);
                ++count;
            }
        }

        list = Arrays.asList(deck);
        Collections.shuffle(list);
    }

    public void showDeck() {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-19s%10s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
        }
    }

    public static void main(String[] args) {
        ShufflePlayingCards shufflePlayingCards = new ShufflePlayingCards();
        shufflePlayingCards.showDeck();
    }
}

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//class PlayingCard {
//
//    PlayingCard(Suite suite, Face face) {
//        this.face = face;
//        this.suite = suite;
//    }
//
//    public static enum Face {Ace,Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King};
//    public static enum Suite {Clubs, Diamonds, Hearts, Spades};
//
//    private final Face face;
//    private final Suite suite;
//
//    public Face getFace() {
//        return face;
//    }
//
//    public Suite getSuite() {
//        return suite;
//    }
//
//    @Override
//    public String toString() {
//        return "face=" + face + ", suite=" + suite;
//    }
//
//}
//
//public class ShufflePlayingCards {
//
//    List<PlayingCard> list;
//
//    ShufflePlayingCards() {
//        PlayingCard[] deck = new PlayingCard[52];
//        int count = 0;
//
//        for (PlayingCard.Suite suite: PlayingCard.Suite.values()) {
//            for (PlayingCard.Face face: PlayingCard.Face.values()) {
//                deck[count] = new PlayingCard(suite, face);
//                ++count;
//            }
//        }
//
//        list = Arrays.asList(deck);
//        Collections.shuffle(list);
//    }
//
//    public void showDeck() {
//        for (int i = 0; i < list.size(); i++) {
//            System.out.printf("%-19s%10s", list.get(i), ((i + 1) % 4 == 0) ? "\n" : "");
//        }
//    }
//
//    public static void main(String[] args) {
//        ShufflePlayingCards shufflePlayingCards = new ShufflePlayingCards();
//        shufflePlayingCards.showDeck();
//    }
//}