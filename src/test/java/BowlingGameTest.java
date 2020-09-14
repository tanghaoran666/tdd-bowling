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
        int result = bowlingGame.calculate(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        assertEquals(0,result);
    }

    @Test
    void should_return_300_when_calculate_given_all_10(){
        int result = bowlingGame.calculate(new int[]{10,10,10,10,10,10,10,10,10,10,10,10});
        assertEquals(300,result);
    }

    @Test
    void should_return_150_when_calculate_given_all_5(){
        int result = bowlingGame.calculate(new int[]{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5});
        assertEquals(150,result);
    }
}
