import java.util.Arrays;

public class Board {

    static Figure[][] board = new Figure[8][8];

    Board() {
        Pawn pawn = new Pawn();
        pawn.fillBoard();
        }



    public String printBoard(){
        String result = "";
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                result += "| " + board[i][j] + " |";
            }
            result += "\n";
        }


        return result;
    }



    }

