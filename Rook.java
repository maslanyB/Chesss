public class Rook extends Figure{
    Rook(boolean color){
        this.color = color;
    }
    Rook[] rook = new Rook[8];
    void move(){};

    @Override
    public String toString() {
        return "Rook";
    }
}
