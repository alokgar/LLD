import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    Board board;
    Dice dice;
    Player winner;
    Deque<Player> players;

    public Game(){
        this.board = new Board(10, 5,4);
        this.dice = new Dice(1);
        players = new ArrayDeque<>();
        players.push(new Player("Alok Garg"));
        players.push(new Player("Aman Verma"));
        this.winner = null;
    }

    public void play(){
        while(winner == null){
            Player currentPlayer = getCurrentPlayer();
            int nextNoOfSteps = dice.rollDice();
            System.out.println(currentPlayer.name + " rolled dice and got a " + nextNoOfSteps + ".");
            int nextPosition = currentPlayer.currentPosition + nextNoOfSteps;
            nextPosition = changeIfJumpsApplicable(nextPosition);
            System.out.println(currentPlayer.name + "'s position changed from " + currentPlayer.currentPosition + " ====> " + nextPosition);
            currentPlayer.currentPosition = nextPosition;
            if(nextPosition >= board.boardSize * board.boardSize){
                winner = currentPlayer;
            }
        }
        System.out.println("The Winner is : " + winner.name + ".");
    }

    int changeIfJumpsApplicable(int nextPosition){
        if(nextPosition >= board.boardSize * board.boardSize) {
            return nextPosition;
        }
        Cell currentCell = board.getCell(nextPosition);
        if(currentCell.jump != null){
            if(currentCell.jump.startPosition <= currentCell.jump.endPosition){
                System.out.println("======================== Jumped a ladder ==============");
            }
            else{
                System.out.println("!!!!!!!!!!!!!!!! Got bitten by a snake !!!!!!!!!!!!!!!!!!!!!");
            }
            nextPosition = currentCell.jump.endPosition;
        }
        return nextPosition;
    }

    Player getCurrentPlayer(){
        Player currentPlayer = players.removeFirst();
        players.addLast(currentPlayer);
        return currentPlayer;
    }
}
