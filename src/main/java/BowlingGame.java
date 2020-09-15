public class BowlingGame {

    public static final int FRAMES_COUNT = 10;

    public int calculate(int[] bowls) {
        int sumScore = 0;
        int frames =0;
        for (int i = 0; i < bowls.length; i++) {
            if(frames>= FRAMES_COUNT) break;
            if(isStrike(bowls,i)){
                sumScore += getStrikeScore(bowls, i);
            }
            else {
                if(isSpare(bowls, i)) {
                    sumScore += getSpareScore(bowls, i);
                } else sumScore += getNormalScore(bowls, i);
                i++;
            }
            frames ++;
        }
        return  sumScore;
    }

    private int getNormalScore(int[] bowls, int i) {
        return bowls[i] + bowls[i+1];
    }

    private int getStrikeScore(int[] bowls, int i) {
        return 10 +bowls[i+1] + bowls[i+2];
    }

    private int getSpareScore(int[] bowls, int i) {
        return 10 +bowls[i+2];
    }

    private boolean isSpare(int[] bowls, int i) {
        return i<bowls.length-1 && getNormalScore(bowls, i) ==10;
    }

    private boolean isStrike(int[] bowls, int i) {
        return bowls[i] == 10;
    }


}
