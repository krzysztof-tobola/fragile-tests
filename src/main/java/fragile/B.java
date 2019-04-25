package fragile;

public class B {
    private final int x;
    private final int y;

    public B(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }
}
