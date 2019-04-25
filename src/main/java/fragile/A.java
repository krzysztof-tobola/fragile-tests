package fragile;

public class A {
    private final B b;

    public A(B b) {
        this.b = b;
    }

    public int compute() {
        return b.x() * b.y() + b.x() * b.x() + b.y() * b.y();
    }
}
