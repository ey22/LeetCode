package EasyCode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix="";
        if(strs.length==1){
            return commonPrefix+=strs[0];
        }
        for(int i=0; i<strs.length; i++){
            if (strs[i].length() == 0) {
                return commonPrefix;
            }
        }
        for(int i=0; i<strs[0].length(); i++){
            for(int j=0; j< strs.length-1; j++){
                if(strs[j].charAt(i)==strs[j+1].charAt(i)){
                    if (j==strs.length-2){
                        commonPrefix+=strs[j].charAt(i);
                        }
                    }else{
                        return commonPrefix;
                        }
                }
            }
        return commonPrefix;
    }

    public static void main(String[] args) {
        String array[] = {"ab","a"};
        LongestCommonPrefix x = new LongestCommonPrefix();
        System.out.println(x.longestCommonPrefix(array));
    }
}
