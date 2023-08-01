public class Board {
    int size;
    PlayingPiece [][] board;

    public Board(int size){
        this.size = size;
        this.board = new PlayingPiece[size][size];
    }

    public void printBoard(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null){
                    System.out.print("[ ] ");
                }
                else{
                    System.out.print("[ " + board[i][j].type + " ] ");
                }
            }
            System.out.println();
        }
    }
    public boolean addPiece(int row, int column, PieceType type){
        if(board[row][column] == null){
            board[row][column] = new PlayingPiece(type);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isFreeCellAvailable(){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(board[i][j] == null) return true;
            }
        }
        return false;
    }

    public boolean checkIfWinningMove(int row, int column, PieceType type){
        boolean rowsMatching = true, columnMatching = true, diagonalMatching = true, antiDiagonalMatching = true;
        // check rows
        for(int c = 0; c < size; c++){
            if(board[row][c] == null || board[row][c].type != type){
                rowsMatching = false;
                break;
            }
        }
        // checking columns
        for(int r = 0; r < size; r++){
            if(board[r][column] == null || board[r][column].type != type){
                columnMatching = false;
                break;
            }
        }

        // checking diagonals
        for(int i = 0, j = 0; i < size; i++, j++){
            if(board[i][j] == null || board[i][j].type != type){
                diagonalMatching = false;
            }
        }

        // checking anti-diagonals
        for(int i = 0, j = size - 1; i < size; i++, j--){
            if(board[i][j] == null || board[i][j].type != type){
                antiDiagonalMatching = false;
            }
        }
        return ( rowsMatching || columnMatching || diagonalMatching || antiDiagonalMatching ) ;
    }

}
