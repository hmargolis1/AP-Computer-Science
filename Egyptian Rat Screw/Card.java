public class Card {
    private String suit;
    private int value;

    public Card() {
        int randomInt = (int) (Math.random() * 4);
        if (randomInt == 0) {
            this.suit = "Spades";
        } else if (randomInt == 1) {
            this.suit = "Hearts";
        } else if (randomInt == 2) {
            this.suit = "Clubs";
        } else {
            this.suit = "Diamonds";
        }
        this.value = (int) (Math.random() * 11) + 1;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "Suit: " + suit + "\nValue: " + value;
    }

    public boolean equals(Card other) {
        return suit.equals(other.getSuit()) && value == other.getValue();
    }
}
