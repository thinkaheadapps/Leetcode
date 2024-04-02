package Strings;

import java.util.*;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        int[] mp1 = new int[256];
        int[] mp2 = new int[256];
        Arrays.fill(mp1, -1);
        Arrays.fill(mp2, -1);
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if ((mp1[ch1] != -1 && mp1[ch1] != ch2) || (mp2[ch2] != -1 && mp2[ch2] != ch1))
                return false;

            mp1[ch1] = ch2;
            mp2[ch2] = ch1;
        }

        return true;

    }

    public static void main(String[] args) {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        // Test cases
        String s1 = "egg";
        String t1 = "add";
        System.out.println("Isomorphic? " + isomorphicStrings.isIsomorphic(s1, t1)); // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println("Isomorphic? " + isomorphicStrings.isIsomorphic(s2, t2)); // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println("Isomorphic? " + isomorphicStrings.isIsomorphic(s3, t3)); // Output: true
    }
}
