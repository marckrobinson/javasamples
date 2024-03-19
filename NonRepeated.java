import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeated {
    public static void main(String[] args) {
        NonRepeated nonRepeated = new NonRepeated();
        String input = "Hello World, Heavy Metal!";
        char firstNonRepeatedChar = nonRepeated.findFirstNonRepeatedChar(input);
        System.out.println("First non-repeated character: " + firstNonRepeatedChar);
    }

    public char findFirstNonRepeatedChar(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        throw new RuntimeException("No non-repeated character found.");
    }
}
