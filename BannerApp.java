import java.util.HashMap;
import java.util.Map;

public class BannerApp {

    // Create and return map of patterns
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " ***  "
        });

        patternMap.put('P', new String[]{
                "**  ",
                "*     * ",
                "*     * ",
                "**  ",
                "*       ",
                "*       ",
                "*       "
        });

        patternMap.put('S', new String[]{
                " ***  ",
                "*       ",
                "*       ",
                " ***  ",
                "      * ",
                "      * ",
                " ***  "
        });

        return patternMap;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                System.out.print(patternMap.get(ch)[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }
}