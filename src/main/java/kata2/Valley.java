package kata2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Valley {
    public static int[] makeValley(int[] arr) {
        Arrays.sort(new int[][]{arr}, Collections.reverseOrder());

        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 1) {
                evenArr.add(arr[i]);
            }
            else {
                oddArr.add(arr[i]);
            }
        }
        Collections.sort(oddArr);
        int i = 0;
        for (int j = 0; j < evenArr.size(); j++) {
            arr[i++] = evenArr.get(j);
        }
        for (int j = 0; j < oddArr.size(); j++) {
            arr[i++] = oddArr.get(j);
        }
        return arr;
    }
}