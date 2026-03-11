import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static Map<Character, String[]> patternMap = new HashMap<>();

    // Function to initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });
    }

    // Function to render banner
    static void renderBanner(String word) {

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        renderBanner("OOPS");
    }
}