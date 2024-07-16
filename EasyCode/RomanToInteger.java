package EasyCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInteger(String s) {
        if ( s.length()==0 || s.length()>15 ){
            return 0;
        }
        int IntegerNumber = 0;

        Map<Character, Integer> roman = new HashMap();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            char element = s.charAt(i);

            /*if (i < s.length() - 1) {
                char secondElement = s.charAt(i + 1);
                if (roman.get(element) < roman.get(secondElement)) {
                    IntegerNumber += (roman.get(secondElement) - roman.get(element));
                    i++;
                    continue;
                }
            }
            IntegerNumber += roman.get(element);*/

            if (i < s.length() - 1) {
                char secondElement = s.charAt(i + 1);
                if (roman.get(element) < roman.get(secondElement)) {
                    IntegerNumber += (roman.get(secondElement) - roman.get(element));
                    i++;
                } else {
                    IntegerNumber += roman.get(element);
                }
            } else {
                IntegerNumber += roman.get(element);
            }
        }
        return IntegerNumber;
    }

    public static void main (String[]args){
        RomanToInteger example = new RomanToInteger();
        System.out.println(example.romanToInteger("XIV"));
    }
}



