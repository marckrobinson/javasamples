import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        String str1 = "Hello";
        String str2 = "lloHe";
        System.out.println(
                "Are the strings \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + anagrams.areAnagrams(str1, str2));
    }

    public boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }
        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}
