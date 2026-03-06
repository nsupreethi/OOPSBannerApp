import java.util.HashMap;
import java.util.Map;

public class OOPSBannerUC8 {

    private static Map<Character, String[]> charPatterns = new HashMap<>();

    static {
        initializePatterns();
    }

    private static void initializePatterns() {
        charPatterns.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });
        charPatterns.put('P', new String[]{
            "****** ",
            "*     *",
            "****** ",
            "*      ",
            "*      "
        });
        charPatterns.put('S', new String[]{
            " ***** ",
            "*      ",
            " ***** ",
            "      *",
            " ***** "
        });
    }

    private static String[] getPattern(char c) {
        return charPatterns.get(c);
    }

    private static void displayBanner(String word) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = getPattern(c);
                line.append(pattern[i]).append("  ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        displayBanner("OOPS");
    }
}