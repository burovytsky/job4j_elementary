import org.junit.Test;
import ru.job4j.array.Turn;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[]{2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[]{33, 23, 4, 1, 6, 2, 3};
        int[] result = turner.back(input);
        int[] expect = new int[]{3, 2, 6, 1, 4, 23, 33};
        assertThat(result, is(expect));
    }
}
