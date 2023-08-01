import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Dice {
    int diceCount;
    int MAX = 6;
    int MIN = 1;
    public Dice(int diceCount){
        this.diceCount = diceCount;
    }

    public int rollDice(){
        int totalStepsCount = 0;
        int diceCountTemp = diceCount;
        while(diceCountTemp > 0){
            int steps = (int)(Math.random() * (MAX - MIN + 1)) + MIN;
            System.out.println("Dice gave : " + steps);
            totalStepsCount += steps;
            diceCountTemp--;
        }
        return totalStepsCount;
    }
}
