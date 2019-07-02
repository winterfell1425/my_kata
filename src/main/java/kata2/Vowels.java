package kata2;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] s = str.split("");
        for (String x : s) {
            if (x.equals("a")) {
                vowelsCount++;
            } else if (x.equals("e")) {
                vowelsCount++;
            } else if (x.equals("i")) {
                vowelsCount++;
            } else if (x.equals("o")) {
                vowelsCount++;
            } else if (x.equals("u")) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}