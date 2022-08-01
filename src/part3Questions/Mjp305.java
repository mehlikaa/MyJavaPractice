package part3Questions;

import java.lang.annotation.Target;
import java.util.Arrays;

public class Mjp305 {
    //Given an array of integers nums and an integer target,
    // return indices of the two numbers such that they add up to target.
    //You may assume that each input would have exactly one solution,
    // and you may not use the same element twice. You can return the answer in any order.
    public static void main(String[] args) {
        int nums[]={2,7,4};        //2,5,4,7,8,9,10};
        int target=6;
        twoSum(nums,target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int b=0;
        for (int i = 0; i < nums.length; i++) {
            if(b==1) break;
            for (int j = 0; j <nums.length ; j++) {
                if ((nums[i]!=nums[j]) && nums[i] + nums[j] == target) {
                    System.out.println("i : "+i+ "\nj = " + j);
                    arr[0] = i;
                    arr[1] = j;
                b=1;
                }
            }

        }
        System.out.println("Arr : "+ Arrays.toString(arr));
        return arr;
    }
}