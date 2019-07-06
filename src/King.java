import java.awt.Color;

public class King extends Piece {
    public King(int x, int y, Color c) {
        super(x, y, c);
    }

    public King() {
        this(0, 0, Color.RED);

    }

    public boolean validMove(int x, int y) {
        // can only move one position up, down, left, right and four corners
        int diffX = posX - x;
        int diffY = posY - y;

        /* I'm sure there's a clever way but this is most readable */
        return (diffX == -1 && diffY == 0) ||
                (diffX == 1 && diffY == 0) ||
                (diffX == 0 && diffY == -1) ||
                (diffX == 0 && diffY == 1) ||
                (diffX == -1 && diffY == -1) ||
                (diffX == 1 && diffY == 1) ||
                (diffX == -1 && diffY == 1) ||
                (diffX == 1 && diffY == -1);
    }

    @Override
    public String toString() {
        return "King at " + posX + ", " + posY;
    }


}
