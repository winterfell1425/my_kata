package kata;

public class TotalPoints {
    public static int points(String[] games) {
        int pointsTotal = 0;
        for (String result: games) {
            int left = (int) result.charAt(0);
            int right = (int) result.charAt(2);
            if (left > right) {
                pointsTotal += 3;
            }
            if (left == right) {
                pointsTotal += 1;
            }
        }
        return pointsTotal;
    }
}