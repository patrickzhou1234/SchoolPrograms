public class CoinGame {
    int startingCoins, maxRounds;
    public int getPlayer1Move() {
        
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
}