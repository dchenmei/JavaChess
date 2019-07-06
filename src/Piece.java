import java.awt.Color;

public abstract class Piece {
    /* Public / private pattern instead of getters / setters */
    public int posX;
    public int posY;
    public Color color;


    public Piece(int x, int y, Color c) {
        posX = x;
        posY = y;
        color = c;
    }

    public Piece() {
        this(0, 0, Color.RED);
    }


    /*
        Only checks if the move is valid from the piece's standpoint, meaning
        ignoring whether there's another piece in place or it goes out of the edge
     */
    public abstract boolean validMove(int x, int y);

    public void move(int x, int y) {
        if (validMove(x, y)) {
            posX = x;
            posY = y;
        }
    }

    public String toString() {
        return "Piece at " + posX + ", " + posY;
    }
}
