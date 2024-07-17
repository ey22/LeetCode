package utils;

public class RemoveDuplicatesFromSortedArray {
    public int[] sortedArray(int[] nums) {
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

    public boolean checkSortedArray(int[] nums){
        int i;
        for(i = 0; i < nums.length-1; i++){
            if (nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }
}
