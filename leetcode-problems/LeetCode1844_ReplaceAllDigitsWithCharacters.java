public class LeetCode1844_ReplaceAllDigitsWithCharacters {

    public static String replaceDigits(String s) {
        char[] chars = s.toCharArray();

        for (int i = 1; i < chars.length; i += 2) {
            int shift = chars[i] - '0';
            chars[i] = (char) (chars[i - 1] + shift);
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1c1e1"));
        System.out.println(replaceDigits("a1b2c3d4e"));
    }
}
