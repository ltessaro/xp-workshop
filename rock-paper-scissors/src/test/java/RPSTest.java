import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RPSTest {

    private RPS rpsGame;

    @Before
    public void setup() {
        this.rpsGame = new RPS();
    }

    @Test
    public void shouldP1WinsWhenThrowsPaperAndP2ThrowsRock() {
        String result = rpsGame.play(RPSInputType.PAPER, RPSInputType.ROCK);

        assertEquals(RPSOutputType.P1_WINS, result);
    }

    @Test
    public void shouldP1WinsWhenThrowsRockAndP2ThrowsScissors() {
        String result = rpsGame.play(RPSInputType.ROCK, RPSInputType.SCISSORS);

        assertEquals(RPSOutputType.P1_WINS, result);
    }

    @Test
    public void shouldP1WinsWhenThrowsScissorsAndP2ThrowsPaper() {
        String result = rpsGame.play(RPSInputType.SCISSORS, RPSInputType.PAPER);

        assertEquals(RPSOutputType.P1_WINS, result);
    }

    @Test
    public void shouldP2WinsWhenThrowsPaperAndP1ThrowsRock() {
        String result = rpsGame.play(RPSInputType.ROCK, RPSInputType.PAPER);

        assertEquals(RPSOutputType.P2_WINS, result);
    }

    @Test
    public void shouldP2WinsWhenThrowsScissorsAndP1ThrowsPaper() {
        String result = rpsGame.play(RPSInputType.PAPER, RPSInputType.SCISSORS);

        assertEquals(RPSOutputType.P2_WINS, result);
    }

    @Test
    public void shouldP2WinsWhenThrowsRockAndP1ThrowsScissors() {
        String result = rpsGame.play(RPSInputType.SCISSORS, RPSInputType.ROCK);

        assertEquals(RPSOutputType.P2_WINS, result);
    }

    @Test
    public void shouldP1AndP2TieIfBothThrowsScissors() {
        String result = rpsGame.play(RPSInputType.SCISSORS, RPSInputType.SCISSORS);

        assertEquals(RPSOutputType.TIE, result);
    }

    @Test
    public void shouldP1AndP2TieIfBothThrowsRock() {
        String result = rpsGame.play(RPSInputType.ROCK, RPSInputType.ROCK);

        assertEquals(RPSOutputType.TIE, result);
    }

    @Test
    public void shouldP1AndP2TieIfBothThrowsPaper() {
        String result = rpsGame.play(RPSInputType.PAPER, RPSInputType.PAPER);

        assertEquals("tie!", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowsNullPointerIfP1IsNull() {
        rpsGame.play(null, RPSInputType.PAPER);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowsNullPointerIfP2IsNull() {
        rpsGame.play(RPSInputType.PAPER, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowsNullPointerIfP1OrP1IsNull() {
        rpsGame.play(null, null);
    }
}
