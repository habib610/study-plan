package org.rhabib;

public class GCD {
    public static void main(String[] args) {

        int n2 = 24, n1 = 60;
        int r;

        while ( n2 != 0) {
                    r = n1 % n2;
                    n1 = n2;
                    n2 = r;
            
        }

        System.out.println("gcd(" + n1 + "," + n2 + ")");
       


    }
}
