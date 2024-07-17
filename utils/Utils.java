package utils;

public class Utils {
    public static int[] sortedArray(int[] nums) {
        boolean sorted = false;
        int i = 0;
        while (!sorted) {
            if (i==nums.length-1){
                if(!checkSortedArray(nums)){
                    i=0;
                } else{
                    sorted = true;
                }
            }
            else if (nums[i] > nums[i + 1]) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                i++;
            } else {
                i++;
            }
        }
        return nums;
    }

    public static boolean checkSortedArray(int[] nums){
        int i;
        for(i = 0; i < nums.length-1; i++){
            if (nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static int array(int[] strs){
        int maxIndex = 0;
        for(int i=1; i<strs.length; i++){
            if (strs[i]>strs[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
