package org.rhabib;

import java.util.*;

public class KidsWithCandiesGreatest {
    public static void main(String[] args) {

        int [] candies = {2,3,5,1,3};

        System.out.println(kidsWithCandies(candies, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList();
       int maxCount = 0;
       for(int candy : candies) {
           if(candy > maxCount) {
               maxCount = candy;
           }
       }  for(int candy : candies) {
           if(candy + extraCandies >= maxCount) {
               result.add(true);
           }      else result.add(false);
       }
        System.out.println(maxCount);


        return result;

    }
}

/**
 * Algorithm
 * maxCount = 0;    temp
 * maxCount <= sum => </=>  result.put(true), maxCount = sum;
 * else maxCount > sum ?  temp.indexOf(
 */
