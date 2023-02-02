package codingBat;

import java.util.Arrays;

public class CBW2_009array123 {
    //Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
            // array123([1, 1, 2, 3, 1]) → true
            // array123([1, 1, 2, 4, 1]) → false
            // array123([1, 1, 2, 1, 2, 3]) → true
    public static void main(String[] args) {
        int numsMain[]={3,2,5,1,9,8,6};
        array123(numsMain);
    }
//    public static boolean array123(int[] nums) {
//        boolean result=false;
//        Arrays.sort(nums);
//        if((Arrays.binarySearch(nums,1)>=0) && (Arrays.binarySearch(nums,2)>=0) && (Arrays.binarySearch(nums,3)>=0))
//            result=true;
//        else result=false;
//        System.out.println("Nums : "+ Arrays.toString(nums)+"\tresult : "+ result);
//        return result;
//    }

    public static boolean array123(int[] nums) {
        // Note: iterate < length-2, so can use i+1 and i+2 in the loop
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }
}
