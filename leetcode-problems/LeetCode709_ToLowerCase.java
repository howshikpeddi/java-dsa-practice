public class LeetCode709_ToLowerCase {

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("LOVELY"));
        System.out.println(toLowerCase("here"));
    }
}
