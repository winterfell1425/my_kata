package kata;

import java.util.ArrayList;
import java.util.List;

public class Division {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> result = new ArrayList<>();
        for(int number : numbers) {
            if (number % divider == 0) {
                result.add(number);
            }
        }
        int[] arr = result.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}
