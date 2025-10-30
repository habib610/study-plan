package org.rhabib;

import java.util.Arrays;

public class MoveAllZeros {
    public static void main(String[] args) {
        int [] nums = { 0, 1, 0, 3, 12};
//        int [] nums2 = new int [nums.length];
//        for (int i = 0, j = 0; i < nums.length; i++) {
//            if(nums[i] != 0) {
//                nums2[j++] = nums[i];
//            }
//        }
//        for (int i = 0; i < nums2.length; i++) {
//           nums[i] = nums2[i];
//        }
//        System.out.println(Arrays.toString(nums));
        int nonZero = 0;
    for(int i=0; i<nums.length; i++){
        if(nums[i] != 0){
            if(i != nonZero){
                int temp = nums[i];
                nums[i] = nums[nonZero];
                nums[nonZero] = temp;

            }
            nonZero++;
        }
    }
        System.out.println(Arrays.toString(nums));


    }
}
