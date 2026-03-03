import java.util.*;

public class BannerApp {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        List<CharacterPatternMap> characters = new ArrayList<>();

        characters.add(new CharacterPatternMap('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        }));

        characters.add(new CharacterPatternMap('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        }));

        characters.add(new CharacterPatternMap('S', new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        }));

        String word = "OOPS";

        for (int row = 0; row < 7; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                for (CharacterPatternMap cp : characters) {
                    if (cp.getCharacter() == ch) {
                        line.append(cp.getPattern()[row]).append("  ");
                    }
                }
            }

            System.out.println(line);
        }
    }
}