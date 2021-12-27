import java.util.ArrayList;
import java.util.List;

public class DiceGame {
    private List<Die> dice = new ArrayList<>();

    private int winNum;
    public DiceGame(){
        this(2,7);
    }
    public DiceGame(int dieNum, int winNum) {
        this.winNum = winNum;
        for (int i = 0; i < dieNum; i++) {
            dice.add(new Die());
        }

    }

    public List<Die> getDice() {
        return dice;
    }

    public void setDice(List<Die> dice) {
        this.dice = dice;
    }

    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }


    public void play(){
        int sum = 0;
        for (Die die: dice) {
            die.roll();
            sum += die.getFaceValue();
        }
        showResult(sum);
    }
    public void showResult(int sum){
        System.out.println(sum==winNum?"Win":"Lose");
        System.out.println("Win Number is "+ winNum + "\nActual number is "+sum);
    }

}
