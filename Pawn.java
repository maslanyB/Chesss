import java.util.Arrays;

public class Pawn extends Figure{
    Pawn[] WhitePawns = new Pawn[8];
    Pawn[] BlackPawns = new Pawn[8];

    Pawn(){}
    Pawn(boolean color){
        this.color = color;
    }
    void move(){};
    void fillBoard(){
        for(int i = 0; i < 8; i++){
            WhitePawns[i] = new Pawn(true); Board.board[1][i] = WhitePawns[i];
            BlackPawns[i] = new Pawn(false); Board.board[6][i] = BlackPawns[i];

        }
    }

    @Override
    public String toString() {
        if(this.color) return "W_Pawn";
        else return "B_Pawn";
    }


}
