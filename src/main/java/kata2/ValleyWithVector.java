package kata2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class ValleyWithVector {
    public static int[] makeValley(int[] arr) {

        Integer[] what = Arrays.stream(arr).boxed().toArray( Integer[]::new );
        Arrays.sort(what, Collections.reverseOrder());

        Vector<Integer> evenArr = new Vector<>();
        Vector<Integer> oddArr = new Vector<>();
        for (int i = 0; i < what.length; i++) {
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