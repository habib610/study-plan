package org.rhabib;

public class ReverseString {
    public static void main(String[] args) {
        String s = "IceCreAm";
       char[] chars = s.toCharArray();
       boolean pointerA  = false;
       boolean pointerB = false;
       int i = 0, j = chars.length - 1;
       String vowels = "aeiouAEIOU";
       System.out.println(chars.length + " " + s.length());

      while (i < j )  {
         if(vowels.indexOf(chars[i]) != -1) {
               pointerA = true;
         }
         if(vowels.indexOf(chars[j]) != -1) {
             pointerB = true;
         }
         if(pointerA && pointerB) {
             char temp = chars[i];
             chars[i] = chars[j];
             chars[j] = temp;
             pointerA = false;
             pointerB = false;
             i++;
             j--;
         } else {
             if(!pointerA) {
                 i++;
             }

             if(!pointerB) {
                 j--;
             }
         }
      }

        System.out.println(chars.toString());
    }
}
