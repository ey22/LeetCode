package EasyCode;

public class MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        for (int element : nums1) {
            System.out.println(element);
        }
    }
/* Takes longer runtime
        int j=0;
        for (int i=m; i<m+n; i++){
            nums1[i]=nums2[j];
            j++;
        }
        j=0;
        int smallest = nums1[j];
        int smallestPlace = j;
        int temp;
        boolean change=false;
        for (int k=j+1; k<nums1.length; k++){
            if(nums1[k]<smallest) {
                change = true;
                smallest = nums1[k];
                smallestPlace = k;
                }if(k==nums1.length-1 && j==nums1.length-2){
                temp = smallest;
                nums1[smallestPlace] = nums1[j];
                nums1[j] = temp;
            }
            else{
                if (k==nums1.length-1 && change) {
                    temp = smallest;
                    nums1[smallestPlace] = nums1[j];
                    nums1[j] = temp;
                    j++;
                    k = j;
                    smallest = nums1[j];
                    smallestPlace = j;
                    change=false;
                }
                if (k==nums1.length-1 && !change){
                    j++;
                    k = j;
                    smallest = nums1[j];
                    smallestPlace = j;
                }
            }
            }
        for(int e:nums1){
            System.out.println(e);
        }
    }
*/
}
