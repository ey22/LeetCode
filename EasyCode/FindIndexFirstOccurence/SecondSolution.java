package EasyCode.FindIndexFirstOccurence;

public class SecondSolution {
    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            String subString = haystack.substring(i, i + needleLength);
            if (subString.equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SecondSolution example = new SecondSolution();
        String haystack = "sawbutsad";
        String needle = "sad";
        System.out.println(example.strStr(haystack,needle));
    }
}