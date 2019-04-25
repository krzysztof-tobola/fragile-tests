package fragile;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CTest {
    @Test
    public void testC() {
        B b = mock(B.class);
        when(b.x()).thenReturn(7);
        when(b.y()).thenReturn(3);
        when(b.x() * b.x() + b.y() * b.y()).thenReturn(100);

        C a = new C(b);
        int result = a.compute();
        assertThat(result, is(7 + 3 - 100));
    }
}
