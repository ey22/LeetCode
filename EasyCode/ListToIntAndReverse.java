package EasyCode;

public class ListToIntAndReverse {
    public static void main(String[] args) {
        int myArray[] = new int[]{3, 8, 4};
        int r = 0;
        int reverse = 0;
        for (int i = 0; i < myArray.length; i++) {
            r = r * 10 + myArray[i];
        }
        System.out.println(r);

        for (int j = 0; j < myArray.length; j++) {
            int x = (int)Math.pow(10, j);
            reverse = reverse + (myArray[j] * x);
        }
        System.out.println(reverse);
    }
}
