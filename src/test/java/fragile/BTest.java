package fragile;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BTest {
    @Test
    public void testB() {
        int x = 3;
        int y = 5;
        B b = new B(x, y);

        assertThat(b.x(), is(x));
        assertThat(b.y(), is(y));
        assertThat(b.x() * b.x() + b.y() * b.y(), is(x * x + y * y));
    }
}
