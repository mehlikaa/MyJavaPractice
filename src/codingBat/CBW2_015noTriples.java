package codingBat;

public class CBW2_015noTriples {
    // Given an array of ints, we'll say that a triple is a value appearing 3 times
    // in a row in the array. Return true if the array does not contain any triples.
    //      noTriples([1, 1, 2, 2, 1]) → true
    //      noTriples([1, 1, 2, 2, 2, 1]) → false
    //      noTriples([1, 1, 1, 2, 2, 2, 1]) → false
    public static void main(String[] args) {
        int arr[]={1,1,2,1,1,4};
        noTriples(arr);
    }

    public static boolean noTriples(int[] nums) {
        int count=0;
        boolean result = true;
        for (int i = 0; i < nums.length-2 ; i++) {
            if ((nums[i] == nums[i + 1]) && ((nums[i+1]) == nums[i + 2])) {
                System.out.println("Say hi 1");
                        count++;
                        System.out.println("Say hi 2 : "+count);
                        if (count == 1) {
                            result = false;
                            break;
                        }
                    }
                }
        System.out.println("Result :"+result);
        return result;
    }
}
