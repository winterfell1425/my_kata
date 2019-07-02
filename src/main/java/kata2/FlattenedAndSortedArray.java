package kata2;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlattenedAndSortedArray {
    public static int[] flattenAndSort(int[][] array) {

        int[] resultArray = Stream.of(array)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
        return resultArray;
    }
}
