import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sorting.RadixSort;

public class RadixSortTest {

    RadixSort sorting = new RadixSort(); 
    int[] v;

    @Test
    public void testSort() {
        v = new int[]{800, 100, 780, 450, 300, 200, 103};
        assertArrayEquals(sorting.radixSort(v), new int[]{100, 103, 200, 300, 450, 780, 800});	

        v = new int[]{2};
        assertArrayEquals(sorting.radixSort(v), new int[]{2}); 

        v = new int[]{2, 3, 4, 1, 1, 5, 1, 2, 5};
        assertArrayEquals(sorting.radixSort(v), new int[]{1, 1, 1, 2, 2, 3, 4, 5, 5}); 

        v = new int[]{1111, 1111, 1111, 2222, 2222 ,2222};
        assertArrayEquals(sorting.radixSort(v), new int[]{1111, 1111, 1111, 2222, 2222, 2222}); 
    }


}




