public class LeetCode58_LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;

        // Skip trailing spaces
        while (index >= 0 && s.charAt(index) == ' ') {
            index--;
        }

        int length = 0;

        // Count characters in the last word
        while (index >= 0 && s.charAt(index) != ' ') {
            length++;
            index--;
        }

        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
