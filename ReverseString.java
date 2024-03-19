public class ReverseString {
    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String str = "Hello, World!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseString.reverseString(str));
    }

    public String reverseString(String str) {
        // Check for null input to avoid NullPointerException
        if (str == null) {
            throw new IllegalArgumentException("Input string cannot be null.");
        }
        return new StringBuilder(str).reverse().toString();
    }
}
