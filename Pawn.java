import java.util.Arrays;

public class Pawn extends Figure{
    Pawn(boolean color){
        this.color = color;
    }
    Pawn[] pawn = new Pawn[8];
    void move(){};

    @Override
    public String toString() {
        return "Pawn";
    }
}
