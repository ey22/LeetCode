package EasyCode;

import java.util.*;

public class ValidParantheses {
    public Boolean isValid(String s) {
        boolean result = false;
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                stack.push(map.get(ch));
            } else {
                if (stack.isEmpty() || ch != stack.pop()) {
                    return false;
                }
            }
        }return true;
    }
        public static void main (String[]args){
            ValidParantheses x = new ValidParantheses();
            System.out.println(x.isValid("[(){}]"));
        }

}



















   /* public boolean isValid(String s) {
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        if (s.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++){
            if (map.get(s.charAt(i))==s.charAt(i+1)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
    */

