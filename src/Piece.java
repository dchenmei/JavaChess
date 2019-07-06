public abstract class Piece {
    private int posX;
    private int posY;

    public Piece(int x, int y) {
        posX = x;
        posY = y;
    }

    public Piece() {
        this(0, 0);
    }

    public abstract void validMove(int x, int y);

    public String toString() {
        return "Piece at " + posX + ", " + posY;
    }
}
