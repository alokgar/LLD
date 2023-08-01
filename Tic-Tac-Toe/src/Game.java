import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Game {
    Deque<Player> players;
    Board board;
    Scanner scanner;

    public Game(){
        initializeGame();
    }

    public void initializeGame(){
        Player playerX = new Player("Alok", new PlayingPiece(PieceType.X));
        Player playerO = new Player("Aman", new PlayingPiece(PieceType.O));
        players = new ArrayDeque<>();
        players.push(playerX);
        players.push(playerO);
        board = new Board(3);
        scanner = new Scanner(System.in);
        System.out.println("=========== Game Initialized ============");
    }

    public void play(){
        boolean hasSomebodyWon = false;
        while(hasSomebodyWon == false){
            if(board.isFreeCellAvailable() == false) {
                hasSomebodyWon = true;
                System.out.println("<======= The match ended in a tie ======>");
                continue;
            }
            Player currentPlayer = players.removeFirst();
            System.out.println(currentPlayer.name + ", Please choose a cell !");
            board.printBoard();
            String [] inputs = scanner.nextLine().split(",");
            int row = Integer.valueOf(inputs[0]);
            int col = Integer.valueOf(inputs[1]);
            boolean isValidMove = board.addPiece(row, col, currentPlayer.piece.type);
            if(!isValidMove){
                System.out.println("!!!!!!!!!!! Invalid Move !!!!!!!!!!!!!!");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);
            boolean isWinningMove = board.checkIfWinningMove(row, col, currentPlayer.piece.type);
            if(isWinningMove) {
                System.out.println("The Winner is : " + currentPlayer.name);
                hasSomebodyWon = true;
            }
        }
    }
}
