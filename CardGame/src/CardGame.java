public class CardGame{

    public static void main(String[] args) {
        Player player1 = new Player("hearts",3);
        Player player2 = new Player("hearts",7);

        compareCard(player1,player2);
        System.out.println(checkWinner(player1,player2));
    }


    public static void compareCard(Player p1,Player p2){
        if(p1.getCard().getNumber()>p2.getCard().getNumber()){
            p1.increamentPoint();
        }else if(p1.getCard().getNumber()<p2.getCard().getNumber()){
            p2.increamentPoint();
        }else{
            int suit1 = p1.getCard().getSuitValue();
            int suit2 = p2.getCard().getSuitValue();
            if(checkSuit(suit1,suit2)){
                p1.increamentPoint();
            }else {
                p2.increamentPoint();
            }
        }
    }
    public static boolean checkSuit(int suit1,int suit2){
        return suit1>suit2;
    }
    public static String checkWinner(Player p1,Player p2){
        if(p1.getPoint()>p2.getPoint()){
            return "Player 1 Won";
        }else{
           return "Player 2 Won";
        }
    }
}