package org.rhabib;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s ="luffy is still joyboy";
        String[] words = s.trim().split("\\s+");
        System.out.println(words[words.length - 1].length());
    }
}
