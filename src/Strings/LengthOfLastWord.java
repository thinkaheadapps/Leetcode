package Strings;

/*
https://leetcode.com/problems/length-of-last-word/description/?envType=daily-question&envId=2024-04-01
 */

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int n = s.length();
        if (n == 0)
            return 0;
        int i = n - 1;
        while (i >= 0 && s.charAt(i) == ' ')
            i--;

        int length = 0;
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            length++;
        }
        return length;
    }

    public int lengthOfLastWordUsingLF(String s) {


        // Trim trailing spaces
        s = s.replaceAll("\\s+$", "");

        // Find the last space character
        int lastSpace = s.lastIndexOf(' ');

        // Calculate the length of the last word
        return lastSpace == -1 ? s.length() : s.length() - lastSpace - 1;
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();

        // Test input strings
        String input1 = "Hello World";
        String input2 = "Hello Test     ";


        int result = lengthOfLastWord.lengthOfLastWord(input1);
        System.out.println(result);

        int result2 = lengthOfLastWord.lengthOfLastWordUsingLF(input2);
        System.out.println(result2);



    }
}
