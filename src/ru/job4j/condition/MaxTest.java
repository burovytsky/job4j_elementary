package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxIs5() {
        int result = Max.max(5, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxIs3() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));

    }

    @Test
    public void whenAreEqual() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

}
