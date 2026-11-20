public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "")
                            .toLowerCase();

        return cleaned.equals(
            new StringBuilder(cleaned).reverse().toString()
        );
    }

    public static void main(String[] args) {
        String[] testCases = {
            "madam",
            "Java",
            "Race car",
            "hello",
            "A man, a plan, a canal: Panama"
        };

        for (String input : testCases) {
            System.out.println(
                input + " -> " + isPalindrome(input)
            );
        }
    }
}
