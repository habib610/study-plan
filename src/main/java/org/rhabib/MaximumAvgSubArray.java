package org.rhabib;

public class MaximumAvgSubArray {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
     
        int [] nums = {1,12,-5,-6,50,3};
        int k = 4;
       for (int i = 0; i+k-1 < nums.length; i++) {
           int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }
            if (sum > max) {
                max = sum;
            }
       }
       double result = (double) (max) / k;
        System.out.println(result);
        System.out.println(max/k);
    }
}
