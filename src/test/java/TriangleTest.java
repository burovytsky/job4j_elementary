import org.junit.Test;
import ru.job4j.condition.Point;
import ru.job4j.condition.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void triangleSquare() {
        Triangle triangle = new Triangle(new Point(1, 1), new Point(5, 4), new Point(1, 5));
        double result = triangle.area();
        assertThat(result, is(8.000000000000002));
    }
}
