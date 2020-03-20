package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(2, 6);
        Point b = new Point(3, 5);
        double expected = 1.4142135623730951;
        double out = a.distance(b);
        Assert.assertThat(out, is(expected));
    }
}
