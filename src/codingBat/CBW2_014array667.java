package codingBat;

import java.util.Arrays;

public class CBW2_014array667 {
    //Given an array of ints, return the number of times that two 6's are next to each
    // other in the array. Also count instances where the second "6" is actually a 7.
    //  array667([6, 6, 2]) → 1
    //  array667([6, 6, 2, 6]) → 1
    //  array667([6, 7, 2, 6]) → 1
    public static void main(String[] args) {
        int[] arr={6,7,4,6};
        array667(arr);
    }


    public static int array667(int[] nums) {
        int result=0;
        System.out.println("How many 6 do you have ? :" +Arrays.binarySearch(nums,6));
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==6){
                if((nums[i+1]==6)||(nums[i+1]==7)){
                result++;
            }
        }}

        System.out.println("Result :"+result);
        return result;
    }
}
