public class Player {

    private int point=0;
    private final Card card;

    public Player(String suit,int number) {
        card=new Card(suit,number);
    }

    public int getPoint() {
        return point;
    }

    public Card getCard() {
        return card;
    }

    public void increamentPoint(){
        point++;
    }
}
