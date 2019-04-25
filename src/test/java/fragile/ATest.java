package fragile;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ATest {
    @Test
    public void testA() {
        B b = mock(B.class);
        when(b.x()).thenReturn(7);
        when(b.y()).thenReturn(3);
        when(b.z()).thenReturn(100);

        A a = new A(b);
        int result = a.compute();
        assertThat(result, is(7 * 3 + 100));
    }
}
