import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.Matchers.is;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(2, 6);
        Point b = new Point(3, 5);
        double expected = 1.41;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        Point a = new Point(2, 6, 3);
        Point b = new Point(3, 5, 2);
        double expected = 1.73;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
