package org.rhabib;

public class PrefixSuffixTricks {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        int length = nums.length;

        int [] prefix = new int[length];
        int [] suffix = new int[length];

        prefix[0] = nums[0];
        for (int i = 1; i < length; i++) {
           prefix[i] = prefix[i-1] * nums[i];
        }

        suffix[length - 1] = nums[length - 1] ;
        for (int i = length - 2; i >= 0; i--) {
            suffix[i] = nums[i] * suffix[i + 1]   ;

        }
        for (int i = 0; i < length; i++) {
            int before = i == 0 ? 1 : prefix[i-1];
            int after = i == length - 1 ? 1 : suffix[i+1];
            nums[i] = before * after;
        }

       for (int i = 0; i < length; i++) {
           System.out.print(nums[i] + " ");
       }
        
    }
}
