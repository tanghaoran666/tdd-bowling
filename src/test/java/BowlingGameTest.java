import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingGameTest {
    BowlingGame bowlingGame;

    @BeforeEach
    void setUp(){
        bowlingGame = new BowlingGame();
    }

    @Test
    void should_return_0_when_calculate_given_all_0(){
        int result = bowlingGame.calculate(new int[]{ 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        assertEquals(0,result);
    }
}
