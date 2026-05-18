import java.util.ArrayList;

public class Deck extends Card {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public void addCards() {
        for (int i = 0; i < 52; i++) {
            deck.add(card);
        }
    }
}
