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

    @Test
    void should_return_126_when_calculate_given_three_10_2_3_5_5(){
        int result = bowlingGame.calculate(new int[]{10,2,3,5,5,10,2,3,5,5,10,2,3,5,5,7,2});
        assertEquals(126,result);
    }

    @Test
    void should_return_90_when_calculate_given_ten_9_0(){
        int result = bowlingGame.calculate(new int[]{9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0,9,0});
        assertEquals(90,result);
    }

    @Test
    void should_return_167_when_calculate_given_random(){
        int result = bowlingGame.calculate(new int[]{10,7,3,8,0,10,0,8,8,2,0,6,10,10,10,7,1});
        assertEquals(163,result);
    }

}
