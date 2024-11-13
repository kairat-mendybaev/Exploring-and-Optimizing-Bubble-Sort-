import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort_randomArray() {
        int[] array = {5, 3, 8, 4, 2};
        BubbleSort.sort(array);
        assertArrayEquals(new int[]{2, 3, 4, 5, 8}, array);
    }

    @Test
    public void testSort_alreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        BubbleSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    public void testSort_descendingOrderArray() {
        int[] array = {9, 8, 7, 6, 5};
        BubbleSort.sort(array);
        assertArrayEquals(new int[]{5, 6, 7, 8, 9}, array);
    }

    @Test
    public void testSort_allElementsSame() {
        int[] array = {7, 7, 7, 7, 7};
        BubbleSort.sort(array);
        assertArrayEquals(new int[]{7, 7, 7, 7, 7}, array);
    }

    @Test
    public void testSort_emptyArray() {
        int[] array = {};
        BubbleSort.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    public void testSort_singleElementArray() {
        int[] array = {1};
        BubbleSort.sort(array);
        assertArrayEquals(new int[]{1}, array);
    }
}
