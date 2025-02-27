package EasyCode;

public class FindIndexFirstOccurence{
    public int strStr(String haystack, String needle) {
        int firstOccurence = -1;
        for (int i = 0; i < haystack.length(); i++) {
            int k = i;
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(k) == needle.charAt(j)) {
                    if (firstOccurence == -1) {
                        firstOccurence = k;
                    }
                    if (k < haystack.length()-1 && j!=needle.length()-1) {
                        k++;
                    }
                    else{
                        if (j==needle.length()-1) {
                            return firstOccurence;
                        }
                        return -1;
                    }
                }
                else{
                    firstOccurence = -1;
                    break;
                }
            }
        }
        return firstOccurence;
    }

    public static void main(String[] args) {
        String haystack = "xysadbutsade";
        String needle = "sade";
        FindIndexFirstOccurence x = new FindIndexFirstOccurence();
        System.out.println(x.strStr(haystack, needle));
    }
}
