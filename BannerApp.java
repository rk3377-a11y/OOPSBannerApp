public class BannerApp {

    // Static method for O pattern
    static String[] getOPattern() {
        return new String[]{
            " *****  ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            "*     * ",
            " *****  "
        };
    }

    // Static method for P pattern
    static String[] getPPattern() {
        return new String[]{
            "******  ",
            "*     * ",
            "*     * ",
            "******  ",
            "*       ",
            "*       ",
            "*       "
        };
    }

    // Static method for S pattern
    static String[] getSPattern() {
        return new String[]{
            " *****  ",
            "*       ",
            "*       ",
            " *****  ",
            "      * ",
            "      * ",
            " *****  "
        };
    }

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        // Print OOPS banner
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + "  " +
                               O[i] + "  " +
                               P[i] + "  " +
                               S[i]);
        }
    }
}