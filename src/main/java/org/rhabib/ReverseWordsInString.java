package org.rhabib;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "Let's take      LeetCode contest";
        StringBuilder builder = new StringBuilder();

        String [] words = s.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {

            builder.append(words[i]).append(" ");
        }
        System.out.println(builder.toString().trim());
    }

}
