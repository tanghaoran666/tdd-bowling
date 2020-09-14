public class BowlingGame {
    public int calculate(int[] bowls) {
        int sumScore = 0;
        double frames =0;
        for (int i = 0; i < bowls.length; i++) {
            System.out.println("---------i="+i);
            System.out.println("---------freames="+frames);
            if(frames ==10) break;
            if(bowls[i] == 10){
                sumScore += 10 +bowls[i+1] + bowls[i+2];
                frames++;
            }else if(i<bowls.length-1 && bowls[i]+bowls[i+1]==10){
                sumScore += 10 +bowls[i+2];
                i++;
                frames++;
            }
            else {
                sumScore += bowls[i] + bowls[i+1];
                frames ++;
                i++;
            }
            System.out.println("------------score=" + sumScore);
        }
        return  sumScore;
    }


}
