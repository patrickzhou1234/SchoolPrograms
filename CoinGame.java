public class CoinGame {
    int startingCoins=10, maxRounds=5;
    public int getPlayer1Move() {
        int result;
        result = (int) (1+10*Math.random());
        return result;
    }
    public int getPlayer2Move(int round) {
        int result;
        if (round%3==0) {
            result = 3;
        } else if (round%2==0) {
            result = 2;
        } else {
            result = 1;
        }
        return result;
    }
    public void playGame() {
        int p1cn=startingCoins, p2cn=startingCoins, crrd=0;
        while (crrd<maxRounds || p1cn<3 || p2cn<3) {
            p1cn-=getPlayer1Move();
            p2cn-=getPlayer2Move(crrd);
            if (getPlayer1Move()==getPlayer2Move(crrd)+1 || getPlayer1Move()+1==getPlayer2Move(crrd)) {
                p2cn++;
            }
            else if (getPlayer1Move()==getPlayer2Move(crrd)+2 || getPlayer1Move()+2==getPlayer2Move(crrd)) {
                p1cn+=2;
            }
            crrd++;
        }
        if (p1cn>p2cn) {
            System.out.print("player 1 wins");
        } else if (p2cn>p1cn) {
            System.out.print("player 2 wins");
        } else {
            System.out.print("tie game");
        }
    }
}