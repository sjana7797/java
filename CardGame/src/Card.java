public class Card {
    private final String suit;
    private final int number;

    Card(String suit,int number){
        this.suit=suit;
        this.number=number;
    }

    public String getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }
    public int getSuitValue(){
        switch (suit){
            case "spades":
                return 4;
            case "diamonds":
                return 3;
            case "hearts":
                return 2;
            case "clubs":
                return 1;
            default:
                return 0;
        }
    }
}
