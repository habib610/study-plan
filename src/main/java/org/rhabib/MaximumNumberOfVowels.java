package org.rhabib;

public class MaximumNumberOfVowels {
    public static void main(String[] args) {
        String  vowels = "aeiou";
        String s = "abciiidef";
        int k = 3;
        int maxVowels = 0;
        int currentCount = 0  ;

        for (int i = 0; i < k; i++) {
             if(vowels.indexOf(s.charAt(i)) != -1) {
                 currentCount++;
             }
        }
        maxVowels = currentCount;

        System.out.println(maxVowels);

        for (int i = k; i < s.length(); i++) {
            if(vowels.indexOf(s.charAt(i-k)) != -1) {
               currentCount--;
            }
            if(vowels.indexOf(s.charAt(i)) != -1) {
                currentCount++;
            }

            if(currentCount > maxVowels) {
                maxVowels = currentCount;
            }
        }
        System.out.println(maxVowels);


    }
}
