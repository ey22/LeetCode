package EasyCode;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int currentValue = nums[0];
        int[] expected = new int[nums.length];
        for (int i=1; i<nums.length; i++){
            if (currentValue == nums[i]) {
                nums[i] = -101;
            }
            else {
                currentValue = nums[i];
            }
        }
        int k = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != -101) {
                expected[k] = nums[i];
                k++;
            }
        }
        for (int i=0; i<expected.length; i++){
            nums[i]=expected[i];
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 1,1,2,2,2,3,4,5,6 };
        RemoveDuplicates a = new RemoveDuplicates();
        int k = a.removeDuplicates(arr);
        System.out.println(k);
    }
}