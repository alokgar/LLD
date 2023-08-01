import java.util.ArrayList;

public class Board {
    public int boardSize;
    public int snakesCount;
    public int laddersCount;
    public  Cell [][]  board;

    public Board(int boardSize, int snakesCount, int laddersCount){
        this.boardSize = boardSize;
        this.snakesCount = snakesCount;
        this.laddersCount = laddersCount;
        this.board = new Cell[boardSize][boardSize];
        initializeCellsOnBoard();
        initializeSnakesOnBoard();
        initializeLaddersOnBoard();
    }

    void initializeCellsOnBoard(){
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                board[i][j] = new Cell();
            }
        }
    }

    void initializeSnakesOnBoard(){
        while(snakesCount > 0){
            int startPosition = (int)(Math.random() * (boardSize * boardSize - 1)) + 2;
            int endPosition = (int)(Math.random() * (boardSize * boardSize - 1)) + 1;
            if(endPosition > startPosition) continue;
            Jump snake = new Jump(startPosition, endPosition);
            Cell snakeCell = getCell(startPosition);
            if(snakeCell.jump != null) {
                continue;
            }
            snakeCell.jump = snake;
            snakesCount--;
        }
    }

    void initializeLaddersOnBoard(){
        while(laddersCount > 0){
            int startPosition = (int)(Math.random() * (boardSize * boardSize - 2)) + 2;
            int endPosition = (int)(Math.random() * (boardSize * boardSize - 2)) + 3;
            if(startPosition > endPosition) continue;
            Jump snake = new Jump(startPosition, endPosition);
            Cell ladderCell = getCell(startPosition);
            if(ladderCell.jump != null) {
                continue;
            }
            ladderCell.jump = snake;
            laddersCount--;
        }
    }

    Cell getCell(int startPosition){
        return board[(startPosition - 1) / boardSize][(startPosition -1) % boardSize];
    }
}
