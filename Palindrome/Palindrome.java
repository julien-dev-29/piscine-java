package Palindrome;

import java.util.Objects;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        return Objects.equals(s, new StringBuilder(s).reverse().toString());
    }
}
