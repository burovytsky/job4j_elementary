import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxIs5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxIs10() {
        int result = Max.max(1, 10, 7, 3);
        assertThat(result, is(10));
    }

    @Test
    public void whenAreEqual() {
        int result = Max.max(1, 1, 1);
        assertThat(result, is(1));
    }
}
