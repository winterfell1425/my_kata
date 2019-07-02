package kata2;

public class CharsCount {
    public static int strCount(String str, char letter) {
        int counter = 0;
        char [] s = str.toCharArray();
        for (char x : s) {
            if(letter==x){
                counter++;
            }
        }
        return counter;
    }
}