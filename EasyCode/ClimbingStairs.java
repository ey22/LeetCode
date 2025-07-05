package EasyCode;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    public int climbStairs(int n) {
        List<Integer> l = new ArrayList<>(45);
        l.addFirst(1);
        l.add(1, 2);
        for (int i = 2; i <= n; i++) {
            int added = l.get(i - 1) + l.get(i - 2);
            l.add(i, added);
        }
        return l.get(n-1);
    }
}
    //another solution with recursive
    //if (n<3) {
    //  return n;
    //}return climbStairs(n-1)+climbStairs(n-2);

