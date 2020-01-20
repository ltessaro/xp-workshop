import java.util.Objects;

public class RPS {

    public String play(String player1, String player2) {

        if (Objects.isNull(player1) || Objects.isNull(player2)) throw new IllegalArgumentException();

        if (player1.equals(player2)) {
            return RPSOutputType.TIE;
        } else if (hasP2Won(player1, player2)) {
            return RPSOutputType.P2_WINS;
        } else {
            return RPSOutputType.P1_WINS;
        }
    }



    private boolean hasP2Won(String player1, String player2) {
        return (player1.equals(RPSInputType.ROCK) && player2.equals(RPSInputType.PAPER))
                || (player1.equals(RPSInputType.PAPER) && player2.equals(RPSInputType.SCISSORS))
                || player1.equals(RPSInputType.SCISSORS) && player2.equals(RPSInputType.ROCK);
    }
}