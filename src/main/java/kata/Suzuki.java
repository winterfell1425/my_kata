package kata;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Suzuki {
    public static long stairsIn20(int[][] stairs) {
        long stairsInOneYear =  Stream.of(stairs)
                .flatMapToInt(IntStream::of)
                .sum();
        return stairsInOneYear*20;
    }
}