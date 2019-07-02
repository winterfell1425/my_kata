package kata2;

public class Arguments {
    public static int countArgs(Object... args) {
        int counter = 0;
        for (Object o : args) {
            counter++;
        }
        return counter;
    }
}