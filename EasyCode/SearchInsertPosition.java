package EasyCode;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int temp;
        while (true) {
            temp = (i + j) / 2;
            if (nums[temp] > target) {
                j = temp;
            } else {
                i = temp;
            }
            if (j - i == 1 || j-i==0) {
                if(target==nums[i] || target<nums[i]) {
                    return i;
                }else if(target>nums[j]){
                    return j+1;
                }else{
                    return i+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        SearchInsertPosition example = new SearchInsertPosition();
        int[] nums = {1,3,5,6};
        System.out.println(example.searchInsert(nums,0));
    }
}
