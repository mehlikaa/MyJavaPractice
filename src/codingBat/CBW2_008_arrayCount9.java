package codingBat;

public class CBW2_008_arrayCount9 {
//Given an array of ints, return the number of 9's in the array.
    // arrayCount9([1, 2, 9]) → 1
    // arrayCount9([1, 9, 9]) → 2
    // arrayCount9([1, 9, 9, 3, 9]) → 3

    public static void main(String[] args) {
        int nums[]={1,7,9,3,6,9,8,9};
        arrayCount9(nums);
    }
    public static int arrayCount9(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i]==9) count++;
        }
        System.out.println(count);
        return count;
    }
}
