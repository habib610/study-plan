package org.rhabib;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println( isSubsequence(  "acb"    ,"ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int pointer = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            for (int j = pointer; j < t.length(); j++) {
                if(ch == t.charAt(j)) {
                    pointer = j+1;
                    ch = ' ';
                    break;
                }
            }

            if(ch != ' ') return false;
        }
        return true;
    }
}
