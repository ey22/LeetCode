package EasyCode;
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int originalX = x;
        int newNumber = 0;
        while(x>0) {
            newNumber = newNumber * 10 + (x % 10);
            x = x / 10;
        }
        if (originalX==newNumber){
            return true;
        }
        return false;
    }
}
