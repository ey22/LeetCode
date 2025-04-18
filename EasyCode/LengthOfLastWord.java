package EasyCode;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        for (int i = s.length() - 1; i >=0; i--) {
            if (count==0 && s.charAt(i)==' '){
                continue;
            }
            else if (s.charAt(i) != ' ') {
                count++;
            }else {
                return count;
            }
        }return count;
    }
    public static void main(String[] args) {
        LengthOfLastWord word = new LengthOfLastWord();
        System.out.println(word.lengthOfLastWord("Hello World  ")); //Length of the "World" without spaces is 5 .
    }
}
