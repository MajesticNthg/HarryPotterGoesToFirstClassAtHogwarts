import java.util.Arrays;

public class Level1 {
    public static String BiggerGreater(String input) {
        char[] ca = input.toCharArray();
        int x = 0;
        int y = 0;

        for (x = input.length() - 1; x >= 0; x--) {
            for (y = x - 1; y >= 0; y--) {
                if (ca[x] > ca[y]) {
                    change(ca, x, y);
                    x = -2;
                    break;
                }
            }
        }

        if (x == -1) return "";
        Arrays.sort(ca, y + 1, input.length());


        return new String(ca);
    }

    public static char[] change(char[] ca, int x, int y) {
        char c = ca[x];
        ca[x] = ca[y];
        ca[y] = c;
        return ca;
    }
}

