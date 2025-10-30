package org.rhabib;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int [] nums = {-1,1,0,-3,3};
        long [] product = new long [nums.length];
        for (int i = 0; i < nums.length; i++) {
                 long sum = 1;
                 for (int j = 0; j < nums.length; j++) {
                     if(i != j) {
                         sum *= nums[j];
                     }
                 }
                 product[i] = sum;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(product[i]);
        }
    }
}
