import org.junit.Test;
import ru.job4j.array.SortSelected;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        System.out.println(Arrays.toString(result));
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void sortingThreeNumbers() {
        int[] input = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(input);

        System.out.println(Arrays.toString(result));
        int[] expect = new int[]{1, 3, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void sortWithSameNumbers() {
        int[] input = new int[]{43, 2, 23, 2, 99, 11, 15};
        int[] result = SortSelected.sort(input);

        System.out.println(Arrays.toString(result));
        int[] expect = new int[]{2, 2, 11, 15, 23, 43, 99};
        assertThat(result, is(expect));
    }
}
