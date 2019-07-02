package kata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int solutionRoot(int A, int B) {
        List<Integer> integersList = new ArrayList(B - A + 1);
        for (int i = A; i <= B; i++) {
            integersList.add(i);
        }
        List<Integer> rootOperationsList = new ArrayList();
        for (Integer number : integersList) {
            int counter = 1;
            double d = Math.sqrt(number);
            System.out.println(d);
            while (d == (int) d) {
                d = Math.sqrt(d);
                if(d != (int) d) {
                    break;
                }
                System.out.println(d);
                counter++;
                rootOperationsList.add(counter);
            }
        }
        System.out.println(rootOperationsList);
        return Collections.max(rootOperationsList);
    }
}