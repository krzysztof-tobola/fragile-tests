package fragile;

public class C {
    private final B b;

    public C(B b) {
        this.b = b;
    }

    public int compute() {
        return b.y() + b.x() - b.z();
    }
}
