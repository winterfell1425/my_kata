package kata2;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double d = Math.sqrt(sq);
        if (d != (long) d) {
            return -1;
        } else {
            long e =(long) d;
            e= e+1;
            long result =  (long) Math.pow(e, 2);
            return result;
        }
    }
}
