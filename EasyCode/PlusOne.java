package EasyCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PlusOne {
    public int[] plusOne(int[] digits){
        int last = digits.length-1;
        for(int i = last; i >= 0; i--){
            if (digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }else{
                digits[i]=0;
                if (i==0){
                    int[] temp = new int[digits.length+1];
                    temp[0]=1;
                    System.arraycopy(digits,0,temp, 1, digits.length);
                    digits=temp;
                        }
                    }
                }return digits;
        }

    public static void main(String[] args) {
        PlusOne object = new PlusOne();
        int[] array = {9,9,9};
        System.out.println(Arrays.toString(object.plusOne(array)));
    }
}