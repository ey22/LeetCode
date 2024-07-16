package EasyCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddTwoNumbers {
    public static ArrayList createListWithInput() {
        ArrayList<Integer> linkedNumber = new ArrayList<>();
        boolean continueToInput = true;
        while (continueToInput) {
            Scanner inputNumber = new Scanner(System.in);
            System.out.println("Please enter a number between 0-9: ");
            int number = inputNumber.nextInt();
            boolean check = true;
            check = numberCheck(number);
            if (!check) {
                break;
            }
            linkedNumber.add(number);
            System.out.println(linkedNumber);

            Scanner question = new Scanner(System.in);
            System.out.println("Would you like to continue Y/N:");
            String continueQuestion = question.nextLine();

            if (continueQuestion.equals("n") || continueQuestion.equals("N")) {
                continueToInput = false;
                int sum = addNumbers(linkedNumber);

            } else if (continueQuestion.equals("y") || continueQuestion.equals("Y")) {
                continueToInput = true;
            } else {
                System.out.println("Invalid input!");
                break;
            }
        }
        return linkedNumber;
    }

    public static boolean numberCheck(int number) {
        if (0 <= number && number <= 9) {
            return true;
        } else {
            System.out.println("Invalid number!");
            return false;
        }
    }

    public static int addNumbers(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        System.out.println("Sum of elements in the list: " + sum);
        return sum;
    }
}


