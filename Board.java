public class Board {

    Figure[][] board = new Figure[8][8];

    Board() {
        Pawn pawnW = new Pawn(true);
        Pawn pawnB = new Pawn(false);
        for (int i = 0; i < 8; i++) {
            pawnW.pawn[i] = new Pawn(true);
            pawnB.pawn[i] = new Pawn(false);
            board[1][i] = pawnW.pawn[i];
            board[6][i] = pawnB.pawn[i];
        }

    }
    public String printBoard(){
        String result = "";
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                 result += ("|" + board[i][j].color + "|");
            }
            result += "\n";
        }


        return result;
    }



    }

