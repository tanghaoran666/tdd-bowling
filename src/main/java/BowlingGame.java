public class BowlingGame {
    public int calculate(int[] bowls) {
        int sumScore = 0;
        for (int i = 0; i < 10; i++) {
            if(bowls[i]==10){
                sumScore += 30;
            }else if(bowls[i]==5){
                sumScore += 15;
            }
            else sumScore += bowls[i];

        }
        return  sumScore;
    }


}
