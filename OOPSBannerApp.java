public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] banner = new String[7];

        banner[0] = String.join(" ",
                "*********",
                "*********",
                "*********",
                "*********"
        );

        // Fill remaining 6 lines similarly

        for(String line : banner) {
            System.out.println(line);
        }
    }
}