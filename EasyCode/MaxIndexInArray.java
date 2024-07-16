package EasyCode;

public class MaxIndexInArray {
    public int array(int[] strs){
        int maxIndex = 0;
        for(int i=1; i<strs.length; i++){
            if (strs[i]>strs[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}
